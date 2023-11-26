package paket;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int number = 0;
		int points = 100;
		int response;
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		number = random.nextInt(100) + 1;
		
		System.out.println("There is a number in my mind; it is between 1 - 100. Can you find it ?\n"
				+ "For every wrong answer you lose 10 points. Your initial points are 100. \n"
				+ "Goodluck :)");
		while(true) {
		System.out.print("Enter your guess:");
		response = sc.nextInt();
		
		if(response == number) {
			System.out.println("Congrats. You win!");
			System.out.println("You earned "+points+" points.");
			break;
		}
		else if(points == 0) {
			System.out.println("You ran out of points. GAME OVER!");
			break;
		}
		else if(response > number) {
			points -= 10;
			System.out.println("Wrong answer. Try a lower number.\n"
					+ "You have "+points+" remaining points.");
		}
		else if(response < number) {
			points -= 10;
			System.out.println("Wrong answer. Try a higher number.\n"
					+ "You have "+points+" remaining points.");
		}
			}
		sc.close();
	}
}
