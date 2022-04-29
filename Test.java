
public class Test {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		calc.fun1();
		calc.fun2(50, 20);
		calc.fun3(20, 5);
		calc.fun4();
	}

}

class Calculator{
	
	public void fun1() {
		int x=100;
		int y=20;
		int z=x+y;
		System.out.println("sum is: "+z);
		System.out.println("----------------");
	}
	public void fun2(int x, int y) {
		int z=x+y;
		System.out.println("sum is:" +z);
		System.out.println("-----------------");
	}
	
	public int  fun3(int x, int y) {
		int z=x+y;
		return z;
	}
	
	public int fun4() {
		int x=1;
		int y=3;
		int z=x+y;
		System.out.println("sum is: "+z);
		return z;
	}
}