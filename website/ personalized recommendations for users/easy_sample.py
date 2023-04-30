import os
import json

from django.shortcuts import render
from django.http import JsonResponse

import numpy as np
import pandas as pd

import tensorflow as tf
from tensorflow import keras

def index(request):
    return render(request, 'index.html')

def recommend(request):
    # Get the user's preferences
    preferences = json.loads(request.body)

    # Load the data for other users
    data = pd.read_sql_query("SELECT preferences FROM users", con)

    # Train the model
    model = keras.Sequential([
        keras.layers.Dense(64, activation='relu', input_shape=(data.shape[1],)),
        keras.layers.Dense(64, activation='relu'),
        keras.layers.Dense(10, activation='softmax')
    ])

    model.compile(optimizer='adam',
              loss='categorical_crossentropy',
              metrics=['accuracy'])

    model.fit(data, epochs=10, batch_size=32)

    # Get the recommendations
    recommendations = model.predict(preferences)

    # Return the recommendations
    return JsonResponse(recommendations, safe=False)

