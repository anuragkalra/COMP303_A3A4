package worldSimulator;

public class Immovable extends Item{

	private final char c;
	
	public Immovable() {
		this.c = 'i';
	}
	
	public char getToken() {
		
		return c;
	}
}
