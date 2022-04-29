
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display dis=new display();
		dis.funyan();
		dis.funyan('a','b');
		dis.funyan('x','y','z');
		//char output=dis.funyan1();
		System.out.println("sum of 4th "+ dis.funyan1());
	}
}
class display{
	public void funyan() {
		char c='a';
		char d='b';
		int z=c+d;
		System.out.println("sum of characters is: " +z);
		System.out.println("-----------");
	}
	public void funyan(char c, char d) {
		int z=c-d;
		System.out.println("sum of characters is: " +z);
		System.out.println("-----------------");
	}
	public char funyan(char c, char d, char e) {
		char z='c'+'d'+'e';
		System.out.println("sum is: " +z);
		System.out.println("------------");
		return z;
	}
	public char funyan1() {
		char c='a';
		char d='b';
		char z=(char) (c+d);
		System.out.println("sum is: "+z);
		return z;
	}
	
}
