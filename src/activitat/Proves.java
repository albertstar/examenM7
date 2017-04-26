package activitat;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class Proves {
	
	@Test
	public void testFibonacci(){
	Fibonacci f1 = new Fibonacci();
	Assert.assertTrue(f1.getRecursiveFibonacci(8) > 10);
	Assert.assertFalse(f1.getRecursiveFibonacci(2) >= 2);
	Assert.assertTrue(f1.getRecursiveFibonacci(2) < 10);
	assertEquals(12.0, f1.getRecursiveFibonacci(-1), 0.005);
	
	}

}
