import java.util.Scanner;


public class FizzBuzz {

	/*
	 * Fizzbuzz is a game for keeping children occupied on car trips.
	 * 
	 * Choose a number and start counting up.  Every time
	 * you get to a number that's divisible by 3, you say "Fizz!"
	 * instead of that number.  Any time you get to a number that's
	 * divisible by 5, you say "Buzz!" instead of that number.  If
	 * you get to a number that's divisible by both 3 and 5, then
	 * you say "Fizzbuzz!".  For example, if we start at 1, we would
	 * go:
	 * 
	 * 1
	 * 2
	 * Fizz!
	 * 4
	 * Buzz!
	 * Fizz!
	 * 7
	 * 8
	 * Fizz!
	 * Buzz!
	 * 11
	 * Fizz!
	 * 13
	 * 14
	 * Fizzbuzz!
	 * 16
	 * 
	 * and so on.
	 * 
	 * This program doesn't do that correctly.  Make the appropriate
	 * corrections to make it work properly.
	 */
	
	protected static final int FIZZ_VALUE = 3;
	protected static final int BUZZ_VALUE = 5;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What number do you want to start at?  ");
		int startingNumber = keyboard.nextInt();
		System.out.println("And what number do you want to go to?  ");
		int endingNumber = keyboard.nextInt();
		
		if(startingNumber > 0 && endingNumber > 0 && endingNumber > startingNumber){
			String fizzBuzzResult = playFizzBuzz(1,10);
			System.out.println(fizzBuzzResult);
		}
		else{
			System.out.println("Invalid inputs.");
		}
		
		keyboard.close();
	}
	
	/*
	 * This method doesn't work as expected.  You can tell by
	 * running the program yourself, or by running the unit
	 * tests in FizzBuzzTest.  Modify it so that it behaves 
	 * correctly.
	 */
	
	public static String playFizzBuzz(int start, int end){
		String result = "";
		for(int i = start; i < end; i++){
			if(isFizz(i)){
				result += "Fizz! ";
			}
			if(isBuzz(i)){
				result += "Buzz! ";
			}
			if(isFizz(i) && isBuzz(i)){
				result += "Fizzbuzz! ";
			}
			result += i;
		}
		return result;
	}
	
	public static boolean isFizz(int i){
		return i % FIZZ_VALUE == 0;
	}
	
	public static boolean isBuzz(int i){
		return i % BUZZ_VALUE == 0;
	}

}
