
public class tuna {

	double length,breath,height,volume;
	
	public void calVolume(double l, double b,double h)
	{
		length=l;
		breath=b;
		height=h;
		
		volume=length*breath*height;
	}
	
	public double getVolume()
	{ 
		return volume;
	}
	
}
