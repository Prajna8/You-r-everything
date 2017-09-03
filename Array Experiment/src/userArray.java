import java.util.Scanner;

public class userArray {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int total=0;
		int bucky[]= new int[3];
		
		for(int i=0; i<bucky.length;i++)
		{
			System.out.print("Enter the number: ");
			bucky[i]= input.nextInt();
		}
			for(int i=0;i<bucky.length;i++)
			{
				System.out.printf(" %s ", bucky[i]);
				
			}
				for (int x: bucky)
				{
					total=total+x;
					}
			
			System.out.println();
		System.out.println("Total is :"+total);
			
	}

}
