package copyarray;

public class MyArray {

	public static void main(String[] args) {
		
		int value[]={2,4,6,8,10};
		int copy_value[]= new int[value.length];
		
		for(int i=0; i<value.length;i++)
		{
			copy_value[i]=value[i];
			System.out.print(copy_value[i]  + " ");
			}
	}

