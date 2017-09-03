import java.util.*;
public class files {

	public static void main(String[] args) {
		
		final Formatter x;
		
		try{
			x= new Formatter("D:\\System.txt");
			System.out.print("Your File is Created");
		}
		catch(Exception e){
			System.out.println("You have an Error");
		}
		}

}
