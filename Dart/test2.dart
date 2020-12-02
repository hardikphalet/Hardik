class Rectangle {
	int length;
	int breadth;
	
	Rectangle({this.length, this.breadth}) {
		assert(length != 0);
		assert(breadth != 0);
	}
	
	int area () {
		return this.length*this.breadth;
	}
	
	int combinedArea (Rectangle shape) {
		return this.area()*shape.area();
	}
}
void main() {
	final shape = Rectangle(length: 2, breadth: 3);
	print(shape.area());
	final secondShape = Rectangle(length: 1, breadth: 5);
	print (shape.combinedArea(secondShape));
	final shapeErr = Rectangle(length: 1, breadth: 2);
	shapeErr.area();
}