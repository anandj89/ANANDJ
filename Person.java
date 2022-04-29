public class Person {
	public static void main(String[] args) {
		/*Learning l1 = new Learning();
		l1.learn();*/
		Resources r = new Resources();
		Effort e = new Effort();
		Knowledge k = r.study(e);
		Teacher  t = k.info();
		Listen l = t.passInfo();
		Learning lrn = l.listenWell();
		lrn.learn();
		
		
	}
}

class Learning {
	public void learn() {
		System.out.println("never stop learning and listen be a better person");
	}
}

class Listen {
	Learning listenWell() {
		Learning le = new Learning();
		return le;
	}
}

class Teacher extends Person {
	Listen passInfo() {
		Listen l = new Listen();
		return l;

	}
}

class Knowledge {
	Teacher info() {
		Teacher t = new Teacher();
		return t;
	}
}

class Resources {
	Knowledge study(Effort e) {
		Knowledge k = new Knowledge();
		return k;
	}
}

class Effort extends ThingsToRememberAlways {

}

class ThingsToRememberAlways {

}

class Student extends Person {

}
