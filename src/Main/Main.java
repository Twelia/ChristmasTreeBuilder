package Main;
import static Utils.Utilities.*;
import java.util.Scanner;
import Utils.Color;
import Christmas.Tree;
//import java.util.InputMismatchException;

public class Main {
	
	public static void main(String[] args) {
		double height, width;
		String color;
		System.out.print("Welcome to the Christmas Tree builder.\nPlease enter the dimensions of  " +
						 "your tree:\nHeight in units: ");
		height = getNumericalInput();

		System.out.print("Width: ");
		width = getNumericalInput();

		color = getColorInput();
		
		System.out.println("\n-- Generating Tree --\n");
		
		Tree XMas = new Tree(height, width, color);
		
		int r = (int) Math.round(getRandom(15,20));
		for(int i=0;i<r;i++){
			randomlyDecorate(XMas);
		}
		
		XMas.putTopStar();		
		System.out.println(XMas);
		
	}
	
	private static String getColorInput() {
		System.out.println("Available Colors:");
		for (int i = 0; i <Color.colors.length; i++) {
			System.out.println(i +  " - " + Color.colors[i]);
		}
				
		Scanner q = new Scanner(System.in);
		System.out.print("Input Color Index: ");
		int choice = 0;
		try {
			choice = q.nextInt();
			while(choice < 0 || choice > Color.colors.length - 1){
				System.out.print("Wrong Index. Try again: ");
				choice = q.nextInt();
			}
		} catch (Exception e){
			System.err.println("\nError: Invalid Entry\n");
			System.out.println();
			return getColorInput();
		} 		
		return Color.colors[choice];
	}
	
	private static double getNumericalInput(){
		Scanner q = new Scanner(System.in);
		double value = 0;
		try{
			value = q.nextDouble();
			while(value <= 0 || value > 100){
				System.out.println("Invalid value. Try again: ");
				value = q.nextDouble();
			}
		} catch (Exception e){
			System.err.println("\nError: Invalid Entry");
			return getNumericalInput();
		}
		return value;
	}
	
}
