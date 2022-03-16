//Q 3 WAP to ask name ,age and salary of an employee and print on console.

package assignment;

import java.util.Scanner;

public class Employee {

	String name;
	int age;
	double salary;
	
	void getDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Employee");
		name=sc.next();
		System.out.println("Enter the Age of Employee");
		age=sc.nextInt();
		System.out.println("Enter the Salary of Employee");
		salary=sc.nextDouble();
	}
	
 void ShowDetails(){
	 System.out.println("*********************************");
	System.out.println("Name of Employee = "+name); 
	System.out.println("Age of Employee = "+age); 
	System.out.println("Salary of Employee = "+salary); 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e= new Employee();
e.getDetails();
e.ShowDetails();
	}

}
