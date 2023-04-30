from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/data')
def get_data():
    data = {'name': 'Aaron', 'age': 30}
    return jsonify(data)

if __name__ == '__main__':
    app.run(debug=True)
