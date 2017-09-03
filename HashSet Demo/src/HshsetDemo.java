import java.util.*;


class student
{
int id;
String name;
student(int i, String s)
{
id=i;
name=s;
}
}

public class HshsetDemo {

	public static void main(String[] args) {
	
			HashSet<student> hs1= new HashSet<>();
			student s1= new student(101, "Abc");
			student s2= new student(102, "def");
			student s3= new student(103, "ghi");
			hs1.add(s1);
			hs1.add(s2);
			hs1.add(s3);
			
			Iterator<student> itr= hs1.iterator();
			while(itr.hasNext())
				{
		System.out.println(itr.next());
				
				}
			}

}
