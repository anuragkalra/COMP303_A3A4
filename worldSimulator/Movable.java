package worldSimulator;

public class Movable extends Item{

private final char c;
	
	public Movable() {
		this.c = 'm';
	}
	
	public char getToken() {
		
		return c;
	}
}
