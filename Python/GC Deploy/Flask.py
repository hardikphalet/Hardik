from flask import render_template
from flask import Flask

app = Flask(__name__)

@app.route('/')
@app.route('/index')
def mainb():
	return render_template('index.html', title = 'Home')

@app.route("/collection")
def coll():
	return render_template('collection.html', title = 'Projects')

if __name__ == "__main__":
	app.run(debug = True)