package worldSimulator;

public abstract class Item {
	
	public Item(char c) {
		this.c = c;
	}
	
	private final char c;
	private int y;
	private int x;
	
	public char getToken() {
		return this.c;
	}
}
