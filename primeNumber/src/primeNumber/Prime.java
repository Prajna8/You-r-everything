package primeNumber;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		/*Scanner myVar= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= myVar.nextInt();
		*/
		
		int num=10;
	int i=2; 
	int count=0;
	
	while(i<num)
	{
		if(num% i==0)
		{
			count=1;
			break;
		}
		i++;
		
	}
	if (count==0)
	{
		System.out.println("Number is prime..");
	}
	else{
		
		System.out.print("Not prime...");
	}
	}

}
