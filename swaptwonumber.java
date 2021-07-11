package Smweek2lab;

public class swaptwonumber {
public static void main(String[] args) {
	float I = 1542.50f, II = 4824.50f; 
	System.out.println("--Before swap--");
	System.out.println("First number = " + I);
	System.out.println("Second number = " + II);
	// Value of first is assigned to temporary
	float temporary = II;
	// Value of second is assigned to first, or you can put float temporary = I
	I = II; // or you can put II=I;
	// Value of temporary (which contains the initial value of first) is assigned to second	second = temporary;
	System.out.println("--After swap--");
	System.out.println("First number = " + I);
	System.out.println("Second number = " + II);
}
}
