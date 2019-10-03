package studentInfo;

import java.util.ArrayList;

public class Student {
	private static ArrayList<Student> list = new ArrayList<Student>();

	private String name;
	private String no;
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getNo() { return no; }
	public void setNo(String no) { this.no = no; }

	public void displayInfo() {
		System.out.println("Name: " + name +"\nStudent number: " + no);	
		
	}
	
	/*public int search(String name) {
		return this.list.indexOf(name);
	}*/
}// end class
