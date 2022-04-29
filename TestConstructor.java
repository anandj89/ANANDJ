
public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.display();
	}

}
class Student{
	int id;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
		
	}
}