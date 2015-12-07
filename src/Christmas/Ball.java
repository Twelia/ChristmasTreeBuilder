package Christmas;
import Utils.Position;

public class Ball extends Decoration implements HangingDecoration {
	
	private double radius;
	
	public Ball(String color, Position location, double size) {
		super(color, location, size);
		setRadius(size/2.0);
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}

	@Override
	public String toString(){
		return super.toString()+" Its radius is " + String.format("%.2f", radius) + " units.";
	}
	
}
