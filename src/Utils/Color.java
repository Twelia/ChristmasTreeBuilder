package Utils;

import static Utils.Utilities.getRandom;

public class Color {
	
	public final static String[] colors = {"Red","Green","Blue","Gold","Silver","White","Yellow","Black"};
	public static final int
						RED		= 0,
						GREEN 	= 1,
						BLUE 	= 2,
						GOLD 	= 3,
						SILVER 	= 4,
						WHITE 	= 5,
						YELLOW 	= 6,
						BLACK 	= 7;
	
	public static String getRandomColor(){
		int index = (int) getRandom(0, colors.length - 1);
		return colors[index];
	}
	
	public static String getColor(int color) {
		return colors[color];
	}

}
