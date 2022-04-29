class Kite{
	private String kiteColor;
	private String kiteOwner;
	private int length;
	protected boolean flyingStatus;
	
	
	private static int kiteCount;

	public Kite(String kiteColor, String kiteOwner, int length,boolean b) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.length = length;
		flyingStatus=b;
		++kiteCount;
		
	}

	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", KiteOwner=" + kiteOwner + ", length=" + length + "]";
	}
	
	void fly() {
		System.out.println(kiteColor+"color kite is flying by.."+kiteOwner+" of length "+length+" flying status being "+flyingStatus);
	}
	
	void kiteFight(Kite ref) {
		for(int i=1;i<=10;i++) {
			double r=Math.random()%100;
			if(r>0.96) {
				ref.flyingStatus=false;
						kiteCount--;
						break;
				
			}
			else if(r<0.95&& r>=0.40) {
				flyingStatus=false;
				kiteCount--;
				break;
			}
			else {
				ref.flyingStatus=false;
				flyingStatus=false;
				kiteCount=kiteCount-2;
				break;
			}
		}
	}
}
public class StaticTest {

	public static void main(String[] args) {
		
		Kite k1=new Kite("red","anand",50,true);
		Kite k2=new Kite("blue","saranya",60,true);
		Kite k3=new Kite("green","bhadra",70,true);
		
		k1.fly();
		k2.fly();
		k3.fly();
		
		k1.kiteFight(k3);
		System.out.println("---------------------------------------------------------");
		
		k1.fly();
		k2.fly();
		k3.fly();

	}

}
