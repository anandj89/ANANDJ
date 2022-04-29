
public class AssociationTest {

	public static void main(String[] args) {
		BankAcc ba = new BankAcc(102, "AJAY", 60000, "989859898");
		ba.printBalance();
		System.out.println("-----------");
		BankAdmin admin = new BankAdmin();
		admin.changeMobileNumber(ba, "8547088325");
		ba.printBalance();
	}
}

class BankAdmin {
	void changeMobileNumber(BankAcc b, String m) {
		b.setMobileNumber(m);
		
	}
}
