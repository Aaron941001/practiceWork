import numpy as np

# Generate an array of sample data
sample_rate = 44100 # samples per second
samples = np.array([np.sin(2*np.pi*1000*t) + np.sin(2*np.pi*2000*t) for t in np.arange(0, 1, 1/sample_rate)])

# Perform the FFT
fft_output = np.fft.fft(samples)

# Get the absolute values of the complex numbers for the frequency spectrum
frequency_spectrum = np.abs(fft_output)
