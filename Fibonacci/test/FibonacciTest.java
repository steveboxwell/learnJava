import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FibonacciTest {

	@Test
	public void testTrivial(){
		assertEquals(1,Fibonacci.getFibonacciNumber(1));
	}
	
	@Test
	public void testTrivial2(){
		assertEquals(1,Fibonacci.getFibonacciNumber(2));
	}
	
	@Test
	public void testNonTrivial(){
		assertEquals(5,Fibonacci.getFibonacciNumber(5));
	}
	
	@Test
	public void testHard(){
		assertEquals(34,Fibonacci.getFibonacciNumber(9));
	}
}
