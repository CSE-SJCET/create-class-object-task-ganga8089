class Student{
	String name;
	int rollNumber;
	char grade;
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+rollNumber);
		System.out.println("Grade: "+grade);
	}
	
}
    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
        Student student=new Student();
    	      student.name="Ganga";
           student.rollNumber=37;
           student.grade='A';
           student.displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
