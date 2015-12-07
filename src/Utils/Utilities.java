package Utils;
import java.util.Random;
import Christmas.*;
import Utils.Color;

public class Utilities {

	public static double getRandom(double min, double max){
		return new Random().nextDouble() * (max - min) + min;
	}
	
	public static void randomlyDecorate(Tree t){
		Decoration temp;
		int r = (int) Math.floor(getRandom(0,3));
		switch (r){
		case 0:
			temp = new Star(Color.getRandomColor(), generatePosition(t),
							Math.sqrt(getRandom(0.05*t.getArea(),0.07*t.getArea())),
							(int) getRandom(4,10));
			break;
		case 1:
			temp = new Ball(Color.getRandomColor(), generatePosition(t),
							Math.sqrt(getRandom(0.05*t.getArea(),0.07*t.getArea())));
			break;
		case 2:
			temp = new Figurine(Color.getRandomColor(), generatePosition(t),
								Math.sqrt(getRandom(0.07*t.getArea(),0.08*t.getArea())));
			break;
		default:
			System.out.println("Well good job, you failed.");
			temp = null;
		}
		t.decorateTree(temp);
	}
	
	public static Position generatePosition(Tree t){
		//tree is considered an isosceles triangle
		double a1,a2,b1,b2;
		//f(x): y1 = a1.x1 + b1, g(x): y2 = a2.x2 + b2
		a1 = t.getHeight() / (t.getWidth() / 2.0);
		b1 = t.getHeight() - (t.getWidth() * a1);
		a2 = -a1;
		b2 = -b1;
		//for any y between y=0 and y=height
		double y = getRandom(0, t.getHeight());
		//for any x between f(x) and g(x)
		double x = getRandom(((y-b2)/a2), ((y-b1)/a1));

		return new Position(x, y);
	}
	
}
