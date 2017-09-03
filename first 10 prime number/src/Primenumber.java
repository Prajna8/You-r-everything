
public class Primenumber {

	public static void main(String[] args) {

		
				int num=30;
				int m=0;
			
	for (int i=2;i<=num;i++)
	{
		
		for(int j=2;j<i;j++)
		{
			
			if(i%j==0)
			{
				m=1;
				break;
			}
			else
			{
				m=0;
			}
		}
	if(m==0)
	{
		System.out.println(i);
	}
	}
	}

}
