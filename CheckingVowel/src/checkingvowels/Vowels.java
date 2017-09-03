package checkingvowels;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner vow = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char u= vow.next().charAt(0);
		
		if(u == 'a' || u == 'A' || u=='E' || u=='e'||u=='i'||u=='I'
				||u=='O' ||u=='o'||u=='u'||u=='U')
		{
			System.out.print("The character entered is a vowel.");
}
		else if((u>='a'&& u<='z')||(u>='A'&& u<='Z'))
			System.out.println("Entered character "+u+" is Consonent");
	      else
		System.out.println("Not an alphabet");

		}
}
