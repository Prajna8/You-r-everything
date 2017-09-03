package palindrome;

import java.util.Scanner;

public class Mydrome {

	public static void main(String[] args) {
	
		int a,b,c,d=0;
		
		System.out.print("Enter the number: ");
		Scanner myVar= new Scanner(System.in);
		c= myVar.nextInt();
		
		b=c;
		while(b>0)
		{
				a = b % 10;
				b = b /10;
				d = b*10+a;
		}
		if(d==c)
		{
				System.out.print("Palindrome");
				}
				else
		{
					System.out.print("Not Palindrome");
}

	}

}
