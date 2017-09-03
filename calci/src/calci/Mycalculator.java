package calci;

import java.util.Scanner;

public class Mycalculator {

	public static void main(String[] args) 
	{


		char op;
		float num1;
		float num2;
		
		System.out.print("Enter operator either + or - or * or /: ");
		Scanner myVar= new Scanner(System.in);
		 op= myVar.next().charAt(0);

		System.out.print("Enter First number:  ");
		Scanner myVar1= new Scanner(System.in);
		num1= myVar1.nextInt();
		
		System.out.print("Enter second number:  ");
		Scanner myVar2= new Scanner(System.in);
		num2= myVar2.nextInt();	
		switch(op)
	    {
	        case '+':
	        	System.out.print(num1+num2);
	            break;

	        case '-':
	        	System.out.print(num1-num2);
	            break;

	        case '*':
	        	System.out.print(num1*num2);
	            break;

	        case '/':
	        	System.out.print(num1/num2);
	            break;

	        default:
	            // If the operator is other than +, -, * or /, error message is shown
	        	System.out.print("Error! operator is not correct");
	        	          break;
	}

}
}
