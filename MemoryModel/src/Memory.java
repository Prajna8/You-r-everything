
public class Memory {
	
	 public double coords[];
	 
	 public Memory(double []coords)
	 {
 this.coords=coords;
	 }

	public static void main(String[] args) {
		
		double []coords={5.0 , 0.0};
		Memory accra= new Memory(coords);
		coords[0]= 32.9;
		coords[1]=-117.2;
		
		System.out.println(accra.coords[0]);
		
		
	}

}
