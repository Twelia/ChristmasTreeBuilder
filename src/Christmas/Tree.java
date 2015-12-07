package Christmas;
import static Utils.Utilities.getRandom;
import java.util.ArrayList;

public class Tree {

	private double height, width;
	private String color;
	private ArrayList <Decoration> decorations = new ArrayList <Decoration>();
	private Star topStar;
	
	public Tree(double height, double width, String color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	public double getArea(){
		return (height * width) / 2.0;
	}
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	
	public void setDimensions(double height, double width){
		this.height=height;
		this.width=width;
	}
	public String getDimensions(){
		String dim = String.format("%d x %d", height, width);
		return dim;
	}
	
	public void putTopStar() {
		topStar = new Star("Gold", new Utils.Position((this.getWidth()/2.0), 0),
				Math.sqrt(getRandom(0.05*this.getArea(),0.07*this.getArea())), 5);
		// Special treatment for the top star in toString
		// decorateTree(topStar);
	}
	
	public void decorateTree(Decoration d){
		decorations.add(d);
	}
		
	@Override
	public String toString() {
		String temp = "This is a " + color.toLowerCase() + ", " + String.format("%.2f", height) + "x"
				+ String.format("%.2f", width) + " Christmas tree.\n";
		for(Decoration d: decorations){
			temp += d+"\n";
		}
		temp += "The tree has a " + topStar.getPoints() +"-pointed star on its top, colored in " + topStar.color.toLowerCase() 
				+ ", and is " + String.format("%.2f", topStar.size)+ " units large.";
		return temp;
	}
	
}
