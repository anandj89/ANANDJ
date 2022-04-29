
public class PhoneTest {
 public static void main(String[] args) {
	 Phone myPhone=new Phone();
	 myPhone.dial();
	 
	 int speedNumber1,speedNumber2;
	 /*speedNumber1=100;
	 speedNumber2=108;*/
	 myPhone.dial(100);
	 
	 String name;
	 myPhone.dial("Anand");
	 myPhone.dial(100,101);
	 myPhone.dial("Anand",88325);
	 
 }
}
class Phone
{
	void dial() {
		System.out.println("dialing nowhere...");
	}
	void dial(int speedDial) {
		System.out.println("dialing.."+speedDial);
	}
	void dial(String contact) {
		System.out.println("dialing.."+contact);
	}
	void dial(int police, int ambulance) {
		System.out.println("dialing police.."+police+"and ambulace at.."+ambulance);
	}
	void dial(String contact, int number)
	{
		System.out.println("The mobile number of "+contact+" is "+number);
	}
}
