
public class understanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	machine machine1 = new machine();
	camera camera1= new camera();
	
	
	machine1.start();
	camera1.start();
	camera1.snap();
	
	machine machine2 =  camera1;
	machine2.start();
		
	}

}
