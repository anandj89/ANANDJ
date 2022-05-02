public class AbstractClassTest {

	public static void main(String[] args) {
		
		Guitar g = new Guitar();
		ElectronicGuitar eg=new ElectronicGuitar();
		Violin v = new Violin();
		Cello c=new Cello();
		Sitar s = new Sitar();
		Flute f=new Flute();
		Saxophone sp=new Saxophone();
		Bagpipe bp=new Bagpipe();
		
		g.utilize();
		g.play();
		g.tuneStr();
		
		v.utilize();
		v.play();
		v.tuneStr();
		
		s.utilize();
		s.play();
		s.tuneStr();
		
		f.utilize();
		f.play();
		f.blow();
		
		sp.utilize();
		sp.play();
		sp.blow();
		
		
		Needle n=new Needle();
		Cutter cu=new Cutter();
		MRIScanner m=new MRIScanner();
		CTScanner ct=new CTScanner();
		
		cu.utilize();
		cu.sterilize();
		cu.diagnose();
		
		m.utilize();
		
		m.diagnose();
		
		ct.utilize();
		
		ct.diagnose();
		
		n.utilize();
		n.sterilize();
		n.diagnose();
		
		
		
		
		
	}
}

abstract class Instrument {
	abstract void utilize();
}

abstract class MusicalInstrument extends Instrument {
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneStr();
}

class Guitar extends StringBasedMusicalInstrument {

	@Override
	void tuneStr() {
		
		System.out.println("Tuning guitar");
	}	
	@Override
	void play() {
			// TODO Auto-generated method stub
		System.out.println("PLaying guitar");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing guitar");
	}

	void pluck() {
		System.out.println("Plucking guitar");
	}
}

class ElectronicGuitar extends Guitar {
	void wire() {
		System.out.println("Wiring guitar");
	}

	void pluck() {
		System.out.println("Plucking electronic guitar");
	}
	
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing  electronic guitar");
	}
}

class Violin extends StringBasedMusicalInstrument {

	@Override
	void tuneStr() {
		// TODO Auto-generated method stub
		System.out.println("Tuning Violin");

	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Violin");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing Violin");
	}

	void pluck() {
		System.out.println("Plucking Violin");	
	}
}

class Cello extends Violin {
	void stand() {
		System.out.println("Cello has a stand");
	}
}

	class Sitar extends StringBasedMusicalInstrument {

		@Override
		void tuneStr() {
			// TODO Auto-generated method stub
			System.out.println("Tuning Sitar");
		}

		@Override
		void play() {
			// TODO Auto-generated method stub
			System.out.println("Playing SItar");
		}

		@Override
		void utilize() {
			// TODO Auto-generated method stub
			System.out.println("Utilizing Sitar");
		}

		void hindustani() {
			System.out.println("Sitar plays Hindustani");
		}

}


abstract class AirBasedMusicalInstrument extends MusicalInstrument {
	abstract void blow();
}

class Flute extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		// TODO Auto-generated method stub
		System.out.println("Blowing Flute");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing flute");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing flute");
	}

	void toneHoles() {
		System.out.println("Flute has toneHoles");
	}

}

class Saxophone extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		// TODO Auto-generated method stub
		System.out.println("Blowing saxophone");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Saxophone");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing Saxophone");

	}

	void keys() {
		System.out.println("Key is arranged in Saxophone");
	}

}

class Bagpipe extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		// TODO Auto-generated method stub
		System.out.println("Blowing Bagpipe");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Bagpipe");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing Bagpipe");
	}

	void bag() {
		System.out.println("Bag is being used for music from bagpipe");
	}

}

abstract class MedicalInstrument extends Instrument {
	abstract void diagnose();
}

abstract class SurgicalMedicalInstrument extends MedicalInstrument {
	abstract void sterilize();
}

class Needle extends SurgicalMedicalInstrument {

	@Override
	void sterilize() {
		// TODO Auto-generated method stub
		System.out.println("Sterilizing Needle");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Needle used as per diagnosis");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing needle");
	}

	void inject() {
		System.out.println("Unjecting using needle");
	}
}

class Cutter extends SurgicalMedicalInstrument {

	@Override
	void sterilize() {
		// TODO Auto-generated method stub
		System.out.println("Sterilizing the cutter");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Cutter used as per diagnosis");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing cutter");
	}

	void cut() {
		System.out.println("Cutting using the cutter");
	}
}

abstract class PathologicalMedicalInstrument extends MedicalInstrument {
	abstract void read();

	abstract void electricSupply();

	abstract void scan();

}

class Glucometer extends PathologicalMedicalInstrument {

	@Override
	void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading sugarlevel using the glucometer");
	}

	@Override
	void electricSupply() {
		// TODO Auto-generated method stub
		System.out.println("Glucometer operated using Electric supply");
	}

	@Override
	void scan() {
		// TODO Auto-generated method stub
		System.out.println("sugarlevel Scanning being done by glucometer");
	}

	void sugarLevelTest() {
		System.out.println("Glucometer showing sugarlevel");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Glucometer used for diagnosis");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utiizing Glucometer");
	}

}

class MRIScanner extends PathologicalMedicalInstrument {

	@Override
	void read() {
		// TODO Auto-generated method stub
		System.out.println("MRI Scanner reads the values");
	}

	@Override
	void electricSupply() {
		// TODO Auto-generated method stub
		System.out.println("MRI Scanner is being operated with Electric Supply");
	}

	@Override
	void scan() {
		// TODO Auto-generated method stub
		System.out.println("MRI Scanner is scanning");
	}

	void magneticField() {
		System.out.println("MRI Scanner uses magnetic field and radio wave for scanning");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("MRI Scanner used for diagnosis");		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing MRI Scanner");
	}

}

class CTScanner extends PathologicalMedicalInstrument {

	@Override
	void read() {
		// TODO Auto-generated method stub
		System.out.println("CT Scanner reads the values");
	}

	@Override
	void electricSupply() {
		// TODO Auto-generated method stub
		System.out.println("CT Scanner is operated with Electric supply");
	}

	@Override
	void scan() {
		// TODO Auto-generated method stub
		System.out.println("CT Scanner is scanning");
	}

	void xray() {
		System.out.println("CT Scanner Uses Xray");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("CT Scanner used for diagnosis");		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Utilizing CT Scanner  ");
		
	}

}
