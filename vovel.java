package Smweek2lab;

import java.util.Scanner;

public class vovel {
public static void main(String[] args) {
	
	char ch = 'i';
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	System.out.println(ch + " is vowel");
	else
	System.out.println(ch + " is consonant");
	
	//How we can make it variable, means using scanner.
	//Scanner scan=new Scanner(System.in);
	//System.out.println("please enter an alphabet");
	//int ch=scan.nextInt();
	
	//if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	//System.out.println(ch + " is vowel");
	//else
	//System.out.println(ch + " is consonant");
	}
}
