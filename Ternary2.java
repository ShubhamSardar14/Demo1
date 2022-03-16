/*Q 2 using ternary check if number eneterd by
user is positive or negative .
In case number is positive store "Positive number" else 
store negative number to Result variable*/


package assignment;

import java.util.Scanner;

public class Ternary2 {

	int num;
	Scanner sc=new Scanner(System.in);	
void CheckNum() {
	System.out.println("enter the number");
	num=sc.nextInt();
	
	String res=num>=0 ? "Number is Positive" : "Number is Negative";
	System.out.println(res);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ternary2 t=new Ternary2();
		t.CheckNum();

	}

}
