package Smweek2lab;

import java.util.Scanner;

public class multiplyTwoNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for i:....");
		int i=scan.nextInt();
		System.out.println("enter value for j:...");
		int j=scan.nextInt();
		
		int multiplication=i*j;
		System.out.println("the multiplication of i&J is:" +multiplication);
			
	}		
}
