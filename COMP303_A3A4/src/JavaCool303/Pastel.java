package JavaCool303;

import java.awt.Color;

public class Pastel implements Cool303Theme{
	private Color color = Color.GREEN;
	private Color bColor = Color.MAGENTA;
	private boolean round = true;
	
	public Color getColor() {
		return color;
	}

	public Color getBackgroundColor() {
		return bColor;
	}

	public boolean isRound() {
		return round;
	}

}