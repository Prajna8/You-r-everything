package factorial;

import java.util.Scanner;

public class Myfactorial {

	public static void main(String[] args) 
	{
		
		
		System.out.print("Enter the number: ");
		Scanner myVar= new Scanner(System.in);
		int num= myVar.nextInt();
		
		int a,b=1;
		
		for(a=1;a<=num;a++)
		{		
			b = b*a;
		}
		
	     	System.out.print("Factorial of "+ num + " is = "+ b);	

	}

}
