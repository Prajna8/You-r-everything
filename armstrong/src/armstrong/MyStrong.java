package armstrong;

import java.util.Scanner;

public class MyStrong {

	public static void main(String[] args) 
	
	{
		int a,b,c,sum=0;
		System.out.print(" Enter the number: ");
		Scanner myVar= new Scanner(System.in);
		a= myVar.nextInt();
		
		b=a;
		 while(b != 0)
		  {
		      c = b % 10;
		      sum += c * c * c;
		      b /= 10;
		  }

		  if(sum == a)
			  System.out.print( a+" is a Armstrong number");
		  else
			  System.out.print( a+" is not a Armstrong number");
	

	}

}
