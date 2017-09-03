import java.util.Scanner;

public class apple {

	public static void main(String[] args) {
		
		Scanner bucky= new Scanner(System.in);
		
		tuna tunaObject = new tuna();
		
		System.out.print("Enter your name: ");
		String name= bucky.nextLine();
		
		
		
		tunaObject.SimpleMessage(name);
	}

}
