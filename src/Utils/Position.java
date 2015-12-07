package Utils;

public class Position {
	private double x;
	private double y;
	
	public Position(){
		x=0;
		y=0;
	}
	
	public Position(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(double x){
		this.x=x;
	}
	public double getX(){
		return x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double getY(){
		return y;
	}
	
	public String toString(){
		String message = String.format("(%.2f ; %.2f)", x, y);
		return message;
	}
	
}
