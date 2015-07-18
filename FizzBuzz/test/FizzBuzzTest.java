import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void testPlayFizzBuzzWithOnlyOneNumber(){
		
		String expectedResult = "1";
		String actualResult = FizzBuzz.playFizzBuzz(1, 2);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testPlayFizzBuzzWithTwoNumbers(){
		
		String expectedResult = "1\n2";
		String actualResult = FizzBuzz.playFizzBuzz(1, 3);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testPlayFizzBuzzWithFiveNumbers(){
		
		String expectedResult = "1\n2\nFizz!\n4\nBuzz!";
		String actualResult = FizzBuzz.playFizzBuzz(1, 6);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testPlayFizzBuzzWithLotsOfNumbers(){
		
		String expectedResult = "1\n2\nFizz!\n4\nBuzz!\nFizz!\n7\n8\nFizz!\nBuzz!\n11\nFizz!\n13\n14\nFizzbuzz!";
		String actualResult = FizzBuzz.playFizzBuzz(1, 16);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testIsFizz(){
		assertTrue(FizzBuzz.isFizz(3));
	}
	
	@Test
	public void testIsNotFizz(){
		assertFalse(FizzBuzz.isFizz(4));
	}
	
	@Test
	public void testIsBuzz(){
		assertTrue(FizzBuzz.isBuzz(5));
	}
	
	@Test
	public void testIsNotBuzz(){
		assertFalse(FizzBuzz.isBuzz(6));
	}
}
