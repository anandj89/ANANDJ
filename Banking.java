
public class Banking {

	public static void main(String[] args) {
		BankAcc baObjRef1 = new BankAcc(101, "Anand", 50000);
		baObjRef1.printBalance();
		System.out.println("-----------------------");

		SavingsAcc saObjRef1 = new SavingsAcc(102, "Saranya", 60000, 5);
		saObjRef1.printBalance();
		System.out.println("-----------------------");

		FixedDepAcc fdObjRef1 = new FixedDepAcc(103, "Bhadra", 70000, 5, 2);
		fdObjRef1.printBalance();
		System.out.println("-----------------------");

		CurrentAcc caObjRef1 = new CurrentAcc(104, "Geetha", 80000, 5);
		caObjRef1.printBalance();
		double e = caObjRef1.oDLimit();
		double f = caObjRef1.monthlyInterest();
		System.out.println("Customer is eligible for a limit of Rs." + e);
		System.out.println("The monthly int will be Rs." + f);
		System.out.println("-----------------------");

	}
}

class BankAcc {
	double accNo;
	String accName;
	double accBal;
	String mobNo;
	/*
	 * BankAcc(double accNo, String accName, double accBal,String mobNo) {
	 * this(double accNo, String accName, double accBal);
	 * 
	 * 
	 * }
	 */

	BankAcc(double a, String b, double c) {
		System.out.println("Bank Acc constructor invoked.....");
		if (a < 0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		} else
			accNo = a;
		if (b == null) {
			throw new RuntimeException("Name cannot be null");
		} else
			accName = b;
		if (c < 0) {
			throw new RuntimeException("Name cannot be null");
		} else
			accBal = c;
	}

	BankAcc(double a, String b, double c, String mobNo) {
		this(a, b, c);
		this.mobNo = mobNo;

	}

	void printBalance() {
		System.out.println("account number is " + accNo);
		System.out.println("account name is " + accName);
		System.out.println("account balance is " + accBal);
		System.out.println("mob number is "+mobNo);
	}

	double withdraw(double amtToWithdraw) {
		if (amtToWithdraw > accBal) {
			throw new RuntimeException("amount to withdraw cannot exceed account balance ");
		} else {
			accBal = accBal - amtToWithdraw;
			return accBal;
		}
	}

	void setMobileNumber(String mob) {
		this.mobNo=mob;
	}



	double getBalance() {
		return accBal;
	}
}

class SavingsAcc extends BankAcc {

	double rateOfInterest;

	SavingsAcc(double a, String b, double c, double d) {

		super(a, b, c);
		System.out.println("Savings Acc constructor invoked.....");
		if (d < 0) {
			throw new RuntimeException("rate cannot be in negative");
		} else
			rateOfInterest = d;
	}

	void printBalance() {
		super.printBalance();
		System.out.println("rate of int is " + rateOfInterest);
	}

}

class FixedDepAcc extends SavingsAcc {
	int tenure;

	FixedDepAcc(double a, String b, double c, double d, int t) {
		super(a, b, c, d);
		System.out.println("Fixed Acc constructor invoked.....");
		if (t < 0) {
			throw new RuntimeException("rate cannot be in negative");
		} else
			tenure = t;
	}

	void printBalance() {
		super.printBalance();
		System.out.println("tenure of fd is " + tenure);
	}

}

class CurrentAcc extends BankAcc {
	double rateOfOD;

	CurrentAcc(int a, String b, int c, int d) {
		super(a, b, c);
		System.out.println("Current Acc constructor invoked.....");
		if (d < 0) {
			throw new RuntimeException("rate cannot be in negative");
		} else
			rateOfOD = d;
	}

	void printBalance() {
		super.printBalance();
		System.out.println("rate of overdraft is " + rateOfOD);
	}

	double oDLimit() {
		double bal = super.getBalance();
		double eligibility = (75.0 / 100) * bal;
		return eligibility;

	}

	double monthlyInterest() {
		double e = oDLimit();
		double mI = (e * rateOfOD * 1.0) / 100;
		return mI;
	}
}



