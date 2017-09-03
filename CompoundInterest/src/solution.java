import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		
		double amount=0, principal, rate,time;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the principal: ");
		principal= input.nextDouble();
		
		System.out.print("Enter the rate: ");
		rate= input.nextDouble();
		
		System.out.print("Enter the time: ");
		time= input.nextDouble();
		
		amount=principal*Math.pow(1+rate, time);

		System.out.print("The amount = "+ amount);
	}

}
