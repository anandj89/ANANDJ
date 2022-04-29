class Events {
	public static void main(String[] args) {
		indoor();
	}
	static void indoor() {
		Play p=new Play();
		DramaArtists da=new DramaArtists();
		Theatre th=new Theatre();
		Lighting lt=new Lighting();
		Entertainment d=p.play(da ,th, lt);
		System.out.println("fun rating is "+d.funvalue(5));
		
	}
	void outdoor() {}
}
class Play extends Events {
	    	Story p = new Story();
	    	Entertainment play( DramaArtists a, Theatre t,Lighting l) {
	    	Entertainment e = new Entertainment();
	    	return e;
	    	}
}
class StandUpComedy extends Events {
			Comedy c = new Comedy();
			Theatre t=new Theatre();
			Comedian cm=new Comedian();
			Entertainment play(Theatre t, Comedian cm) {
			Entertainment e = new Entertainment();
			return e;
			}
}
class Story {}
class Entertainment {
	int funvalue(int a){
		return a;
		}
	
}
class DramaArtists {}
class Props {}
class Lighting {}
class Theatre {}
class Comedy {}
class Comedian{}


class Artist{
	Talent t=new Talent();
	
	 
	
}

class Talent{}



class Food{
	Taste t=new Taste();
}

class Vegetarian extends Food{
	
}
class NonVegetarian extends Food{
	
}
class Taste{
	
}