package worldSimulator;
import java.util.*;

public class World {

	private int height;
	private int width;
	private char[][] grid;
	
	public World(int height, int width) {
		this.grid = new char[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				grid[i][j] = '_';
			}
		}
	}
	
	public void step() {
		
		display();
	}
	
	/**
	 * adds the specified item to the 2d array
	 * @param i
	 */
	private void add(Item i) {
		char c = i.getToken();
		Random random = new Random();
		boolean valid = false;
		while (!valid) {
			int ranY = random.nextInt(height);
			int ranX = random.nextInt(width);
			
			if (grid[ranY][ranX] == '_') {
				grid[ranY][ranX] = c;
				valid = true;
			}
			else valid = false;
		}
	}
	
	/**
	 * Displays the current world
	 */
	public void display() {
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(grid[height][width]);				
			}
			System.out.println();
		}
	}
}
