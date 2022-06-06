package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentId;
	private String courses = "";
	private int tuitionBalance= 0;
	private static int CostofCourse= 600;
	public static int id = 1000;
	
	//Constructor: ask user to enter name and year of student
		public Student () {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter student first name:" );
			this.firstName = in.nextLine();
			
			System.out.print("Enter student last name:" );
			this.lastName = in.nextLine();
			
			System.out.print("Grade Years:\n1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade year:" );
			this.gradeYear = in.nextInt();
			
			setStudentId();
			
			//System.out.print(firstName + " " + lastName + " " + gradeYear + "" + studentId);
		}

	//generate unique student id - Fist digit being grade level
		public void setStudentId() {
			id++;
			this.studentId = gradeYear + id;
		}
		
    // Enroll in course
		public void enroll() {
		
			do {
			System.out.print("\nEnter Course to enroll in: (Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
			courses = courses+ "\n" + course;
			tuitionBalance = tuitionBalance + CostofCourse; 
			} 
			else break;
			}
			while(1!=0);
			//System.out.println("Enrolled Course:" + courseName);
			System.out.println("Tuition Balance:" + tuitionBalance);

		}
	
		
	//display balance
		
		public void viewBalance() {
		  // System.out.println("Your Balance is $" + " " + tuitionBalance);
		}
	
	//Pay tuition 
		
		public void payTuition() {
			System.out.print("Enter amount you wish to pay");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment; 
			System.out.println("Thank You for paying your tuition of $" + payment);
			viewBalance();
		}

	
	//combine elements and display name, id, course, balance
	public String studentDetails() {
		return("Name:" + firstName + " " + lastName + " " +
				"\nStudentId:" + studentId +
					"\nCourses Enrolled:"  + courses + 
					"\nBalance: $" + tuitionBalance );
		
	}
	
}
