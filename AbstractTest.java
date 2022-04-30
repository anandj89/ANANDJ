
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class Instrument{
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument{
	abstract void tuneStr();
}
class Guitar extends StringBasedMusicalInstrument{

	@Override
	void tuneStr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	
	void pluck() {
		
	}
}
class ElectronicGuitar extends Guitar{
	void wire() {
		
	}
}
class Violin extends StringBasedMusicalInstrument{

	@Override
	void tuneStr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	void pluck() {
		
	}
}
class Cello extends Violin{
	void stand() {
		
	}
}
abstract class AirBasedMusicalInstrument extends MusicalInstrument{
	abstract void blow();
}
class flute extends AirBasedMusicalInstrument{

	@Override
	void blow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}