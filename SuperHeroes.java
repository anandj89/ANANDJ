
public class SuperHeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Strength st=new Strength();
		st.superHeroInfo("spider-man", "student", 1000);
		st.superHeroInfo("batman", "businessman", 5000);
	}
}
class Strength{
				
	private String heroName;
	private String secretIdentity;
	private int numberOfPeopleSaved;
	
	public void superHeroInfo(String Name, String SecretIdentity, int PeopleSaved) {
		
		Name = Name;
		secretIdentity = SecretIdentity;
		numberOfPeopleSaved = PeopleSaved;
	
		System.out.println(Name+" secret identity is "+ SecretIdentity+" and has saved "+PeopleSaved +" people");
	}
	void flying() {
		System.out.println("SuperMan is flying");
	}
//	void lightning() {
//		System.out.println("Thor is lightning with hammer");
//	}
//	void Run() {
//		System.out.println("Flash is running");
//	}
//	void webbing() {
//		System.out.println("Spider-man is running");
//	}
}