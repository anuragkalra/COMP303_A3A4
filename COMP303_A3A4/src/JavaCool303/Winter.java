package JavaCool303;

import java.awt.Color;

public class Winter implements Cool303Theme{
	private Color color = Color.BLUE;
	private Color bColor = Color.CYAN;
	private boolean round = false;
	
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