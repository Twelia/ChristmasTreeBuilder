package Christmas;
import Utils.Position;

public abstract class Decoration {
	
	protected String color;
	protected Position location;
	protected double size; //bounding box bigger dimension
	
	public Decoration(String color, Position location, double size){
		setColor(color);
		setSize(size);
		setLocation(location);
	}
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	public void setSize(double size){
		this.size=size;
	}
	public double getSize(){
		return size;
	}
	
	public void setLocation(Position location){
		this.location=location;
	}
	
	public void setX(double x){
		location.setX(x);
	}
	public double getX(){
		return location.getX();
	}
	public void setY(double y){
		location.setY(y);
	}
	public double getY(){
		return location.getY();
	}
	
	@Override
	public String toString(){
		String temp = this.getClass().getInterfaces()[0].getSimpleName();
		int index = temp.indexOf("Decoration");
		return "There is a " + temp.substring(0, index).toLowerCase() + " " + this.getClass().getSimpleName().toLowerCase()
				+ " at location " + location + ", colored in " + this.color.toLowerCase() + ", and its size is of "
				+ String.format("%.2f", size) + " units.";
	}
	
}
