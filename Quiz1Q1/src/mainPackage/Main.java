package mainPackage;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the QB's touchdowns. ");
		int touchDowns = input.nextInt();
		
		input.close();
		
		System.out.println(calculateRating(touchDowns));
	}
	
	public static int calculateRating(int touchDowns){
		System.out.println("eggs");
		return 5;
	}

}
