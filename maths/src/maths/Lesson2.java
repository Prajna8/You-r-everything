package maths;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myVar= new Scanner(System.in);		
		System.out.print(" Enter the First number: ");
		int x= myVar.nextInt();
		//System.out.print(x);
		
		Scanner scan2= new Scanner(System.in);
		System.out.print(" Enter the second number: ");
		int y= scan2.nextInt();
		//System.out.print(y);
		
		int answer=x+y;
		System.out.print(" Total = " + answer);	
		
		
	}

}
