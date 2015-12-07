package Christmas;
import Utils.Position;

public class Star extends Decoration implements HangingDecoration {

	private int points; //points in a star
	
	public Star(String color, Position location, double size, int points) {
		super(color, location, size);
		this.points=points;
	}
	
	public int getPoints() {
		return points;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It is " + points + "-pointed.";
	}	
}
