package ua.lviv.lgs;

class first_app {

	public static void main(String args[]) {
	 Rectangle rect = new Rectangle(5, 5);
		System.out.println("Площа прямокутника = " + rect.getArea());
		System.out.println("Периметр прямокутника = " + rect.getPerimeter());
	}
}

class Rectangle {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double getArea() {
		return length * width;
	}

	double getPerimeter() {
		return length + width + length + width;
	}
}
