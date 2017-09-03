package scan1;

//import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int user_input_number= scan.nextInt();
		System.out.println("The Entered value is: "+ user_input_number);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the Some decimal value: ");
		double user_input_double= scan2.nextDouble();
		System.out.println("The Entered value is: "+ user_input_double);
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter the Some text: ");
		String user_input_string= scan3.nextLine();
		System.out.println("The Entered text is: "+ user_input_string);
		
		// TODO Auto-generated method stub

	}

}
