
public class BankingFunctions {

	public static void main(String[] args) {
		//BankAccount ba;//=new BankAccount(101,"ANAND", "INDIVIDUAL CHS, SECT 40,SEAWOODS", "8547088325");
		ApplicationForm af1=new ApplicationForm();
		ApplicationForm af2=new ApplicationForm();
		ApplicationForm af3=new ApplicationForm();
		BankAccount ba1=af1.ApplicationForm(101,"ANAND", "INDIVIDUAL CHS, SECT 40,SEAWOODS", "8547088325");
		BankAccount ba2=af2.ApplicationForm(102,"SARANYA", "INDIVIDUAL CHS, SECT 40,SEAWOODS", "8547088325");
		BankAccount ba3=af3.ApplicationForm(103,"BHADRA", "INDIVIDUAL CHS, SECT 40,SEAWOODS", "8547088325");
		ba1.printApplication(ba1);
		ba2.printApplication(ba2);
		ba3.printApplication(ba3);

	}

}

class BankAccount {
	private double accountNumber;
	private String accountName;
	private String accountHolderAddress;
	private String mobileNumber;
	private double accountBalance;

	public BankAccount(double accountNumber, String accountName, String accountHolderAddress, String mobileNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountHolderAddress = accountHolderAddress;
		this.mobileNumber = mobileNumber;
		
	}

	@Override
	public String toString() {
		return "AccountNumber=" + accountNumber + ", AccountName=" + accountName
				+ ", AccountHolderAddress=" + accountHolderAddress + ", MobileNumber=" + mobileNumber + "]";
	}

	protected BankAccount(double accountNumber, String accountName, String accountHolderAddress, String mobileNumber,double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountHolderAddress = accountHolderAddress;
		this.mobileNumber = mobileNumber;
		this.accountBalance = accountBalance;
	}

	

	public String getAccountName() {
		
		return accountName;
	}

	public void setAccountName(String accountName) {
		if(accountName==null) {
			throw new RuntimeException("ACCOUNT NAME CANNOT BE NULL");
		}
		else
		this.accountName = accountName;
	}

	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}

	public void setAccountHolderAddress(String accountHolderAddress) {
		
		if(accountHolderAddress==null) {
			throw new RuntimeException("ACCOUNT HOLDER'S ADDRESS CANNOT BE NULL");
		}
		else
		this.accountHolderAddress = accountHolderAddress;
	}

	public String getMobileNumber() {
		
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		if(accountHolderAddress==null) {
			throw new RuntimeException("ACCOUNT HOLDER'S MOBILE NUMBER CANNOT BE NULL");
		}
		else
		this.mobileNumber = mobileNumber;
	}

	public double getAccountNumber() {
		if(accountNumber<=0) {
			throw new RuntimeException("ACCOUNT HOLDER'S ADDRESS CANNOT BE NULL");
		}
		else
		return accountNumber;
	}

	public double getAccountBalance() {
		if(accountNumber<0) {
			throw new RuntimeException("ACCOUNT HOLDER'S ADDRESS CANNOT BE NULL");
		}
		else
		return accountBalance;
	}
	void printApplication(BankAccount ba) {

		System.out.println("The Application details are as follows:-" + ba.toString());
	}


}



//SAVINGS ACCOUNT
class SavingsAccount extends BankAccount{
	int rate;
	public SavingsAccount(double a, String b, String c, String d,double e,int rate) {
		super(a,b,c,d,e);
		if(rate<0) {
			throw new RuntimeException("ACCOUNT HOLDER'S ADDRESS CANNOT BE NULL");
		}
		else {
			System.out.println("rate of Interest is");
			int r=rate;
		}
		
	}
	public void printBalance(BankAccount ba) {
		
		super.printApplication(ba);
		
	}
	
}



//APPLICATION FORM

class ApplicationForm  {

	static int applicationNumber;
	

	BankAccount ApplicationForm(double acno, String acName, String acAdd, String mob) {
		
		BankAccount ba=new BankAccount(acno,acName,acAdd,mob);
		++applicationNumber;
		if(applicationNumber==3){
			throw new RuntimeException("Please order for new application forms");
		
		}
		else 
			 return ba;
		//System.out.println("The Application details are as follows:-" + ba.toString());
	}
	
	
}

//BANK ADMIN	
class BankAdmin {

	BankAccount ba = new BankAccount(101, "ANAND", "INDIVIDUAL CHS, SECT 40,SEAWOODS", "8547088325");

	

	
		

	}


