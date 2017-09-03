package fibonnaci;

import java.util.Scanner;

public class Myseries {

	public static void main(String[] args) {

int a = 1;
int b = 0;
int c ;

Scanner myVar = new Scanner(System.in);
System.out.print("Enter the number: ");
int num =myVar.nextInt();

for(int i= 0;i<num;i++)
{
	System.out.print(b +" ");
	c=a+b;
	a=b;
	b=c;
}

 }

}
