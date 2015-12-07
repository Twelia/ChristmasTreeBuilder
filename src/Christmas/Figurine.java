package Christmas;
import Utils.Position;
import static Utils.Utilities.*;

public class Figurine extends Decoration implements StandingDecoration {
		
	private String name;
	private static String[] names = {"Santa Claus", "shepherd", "angel", "fairy", "soldier",
		 "elf", "snowman", "penguin", "deer", "sheep", "donkey",
		 "cow", "dog", "bear", "horse", "rabbit", "bird"};
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public static String getRandomFigurine(){
		int index = (int) getRandom(0, names.length - 1);
		return names[index];
	}
	
	public Figurine(String color, Position location, double size) {
		super(color, location, size);
		this.name=getRandomFigurine();
	}
	
	@Override
	public String toString(){
		String temp = super.getClass().getInterfaces()[0].getSimpleName();
		int index = temp.indexOf("Decoration");
		return "There is a " + name + " " + temp.substring(0, index).toLowerCase() + " " + this.getClass().getSimpleName().toLowerCase()
				+ " at location " + location + ", colored in " + this.color.toLowerCase() + ", and its size is of "
				+ String.format("%.2f", size) + " units.";
	}
	
}
