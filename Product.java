/*Q 5 wap to ask product name and price of product
from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price*/

package assignment;

import java.util.Scanner;

public class Product {
	String pname;
	double price;
	Scanner sc=new Scanner(System.in);
  void	getdata(){
	System.out.println("Enter Product Name");
	pname=sc.next();
	
	System.out.println("Enter Product Price");
	price=sc.nextDouble();
	}
  
  void Discount() {
	  if(price>2000)
		  System.out.println("10% discount");
	  else 
		  System.out.println("7% discount");
  }

  void Show() {
	  System.out.println("*************************");
	  System.out.println("Product Name = "+pname);
	  System.out.println("Product Price = "+price);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p=new Product();
		p.getdata();
		p.Show();
		p.Discount();
	}

}
