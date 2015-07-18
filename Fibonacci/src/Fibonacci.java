import java.util.Scanner;


public class Fibonacci {

	/*
	 * Fibonacci numbers go like this:
	 * 
	 * 1 1 2 3 5 8 13 21...
	 */
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many fibonacci numbers do you want?  ");
		int numberOfSteps = keyboard.nextInt();
		if(numberOfSteps > 0){
			int fibonacciNumber = getFibonacciNumber(numberOfSteps);
			System.out.println("The " + numberOfSteps + "th fibonacci number is " + fibonacciNumber);
		}
		else{
			System.out.println("Invalid input.");
		}
		
		keyboard.close();
	}

	
	/*
	 * This method doesn't return the nth fibonacci number.
	 * 
	 * Make it so.
	 */
	protected static int getFibonacciNumber(int numberOfSteps) {
		return -1;
	}
}
