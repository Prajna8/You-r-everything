package multi;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int num, multi;
		Scanner bucky= new Scanner(System.in);
		System.out.print("Enter the number: ");
		num =bucky.nextInt();
		
		 for(int i=1; i<=10;i++)
		 {
			 multi=num*i;
			 System.out.println(num+" X "+ i + " = "+multi);
			 
		 }
		
		
		// 
	}

}
