
public class ArrayTable {

	public static void main(String[] args) {
		
		System.out.println("Student Name\t\t Marks");
		
		int mark[]= {30,40,50,60,70};
		String name[]={"Ajay","Sumit","Rahul","Vivek","Suresh"};
		
		for(int i=0; i< mark.length;i++)
		{
			System.out.println(name[i] + "\t\t\t  " + mark[i]);	
			
		}
		

	}

}
