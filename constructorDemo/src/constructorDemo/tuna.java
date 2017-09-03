package constructorDemo;

public class tuna {
	
	private String girlName;
	
	public tuna(String name)
	{
		girlName=name;
	}	
		public void setName(String name)
		{
			girlName=name;
		}
			public String girlName()
			{
				return girlName;
			}
				public void saying()
				{
					System.out.println("Your Girl Friend name was: "+ girlName());
				}
}

