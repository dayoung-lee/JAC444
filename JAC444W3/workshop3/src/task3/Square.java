package task3;

public class Square extends GeometricObject implements Colorable {
	private double length;
	
	public Square() { length = 0; }

	public Square(double length) { this.length = length; }

	public Square(double length, String color, boolean filled) {
		this.length = length;
		setColor(color);
		setFilled(filled);
	}

	public double getlength() {	return length; }

	public void setlength(double length) { this.length = length; }

	@Override
	public double getArea() { return length * length; }
	
	@Override
	public double getPerimeter() { return length * 4; }

	@Override
	public String howToColor() { return "Color all four sides"; }
	
	@Override
	public String toString() {
		return super.toString() + "\nLength: " + length + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

}