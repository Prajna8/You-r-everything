package reverse;

import java.util.Scanner;

public class Myreverse {

		public static void main(String[] args)
		{
			
			
			System.out.print("Enter the number: ");
			Scanner myVar= new Scanner(System.in);
			int num= myVar.nextInt();
			
			for(int i=1; i<=num; i++)
			{
			for(int j=num; j>i; j--)
			{
				System.out.print(j);
			}
				System.out.println(" ");
			}
			

		}

	}


