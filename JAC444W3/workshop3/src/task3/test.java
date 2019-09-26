package task3;

public class test {
	public static void main(String[] args) {
		GeometricObject[] squares = { new Square(5, "red", true), new Square(2, "white", false),
				new Square(10, "black", true), new Square(8.2, "blue", false), new Square(3.5, "green", true) };

		for (int i = 0; i < squares.length; i++) {
			System.out.println("\nSquare #" + (i + 1));
			System.out.println(squares[i].toString());
			System.out.println("How to color: " + ((Square) squares[i]).howToColor());
		}

	}
}
