package worldSimulator;

public class Simulation {

	public static void main(String[] args) {
		
		World w = new World(100, 100);
		w.add(new Movable());
		w.add(new Immovable());
		w.add(new Autonomous());
		
		for (int i = 0; i < 100; i++) {
			w.step();
		}
	}
}
