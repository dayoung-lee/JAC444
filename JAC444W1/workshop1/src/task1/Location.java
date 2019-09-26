// JAC444 Workshop1
//  Name: Dayoung Lee     Student ID: 121693162      Date: 1/10/2019

package task1;
import java.util.Scanner;

public class Location {	
	public int row=0, column=0;
	public double maxValue = 0;
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the number of rows and columns in the array: ");

		// return true if it's a valid int
		while(!scan.hasNextInt()){
			System.out.println("Errors! Try again.");
			scan.next();		
		}
		
		int row = scan.nextInt();
		int column = scan.nextInt();				
		
		while(row < 1 || column < 1){				
			System.out.println("Invalid numbers. Try again.");			
			row = scan.nextInt();
			column = scan.nextInt();				
		}				
		scan = new Scanner(System.in);		
		
		double[][] matrix = new double[row][column];		
		
		System.out.println("Enter the array: ");
		
		for(int i = 0; i< matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = (int) scan.nextDouble();
			}
		} scan.close(); // resource leak
		
		
		// call locateLargest function
		Location location = Location.locateLargest(matrix);
		System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
					
		}
	
	
	public static Location locateLargest(double[][] a) {
		Location location = new Location();

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
	 return location;
	}	
	 
}
