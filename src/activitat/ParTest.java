package activitat;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParTest {
	private double esperado, delta, actual;
	private Fibonacci f;
	
	@Parameters
	public static Collection<Double[]> data(){
		return Arrays.asList(new Double[][] {
				{1.0, 1.0, 0.03}, 
				{2.0, 1.0, 0.03},
				{3.0, 2.0, 0.03},
				{4.0, 3.0, 0.03},
				{5.0, 5.0, 0.03},
				{6.0, 8.0, 0.03},
				{7.0, 13.0, 0.03},
				{8.0, 21.0, 0.03},
				{9.0, 34.0, 0.03},
				{10.0, 55.0, 0.03},
				{11.0, 89.0, 0.03},
				{12.0, 144.0, 0.03},
				{13.0, 233.0, 0.03},
				{14.0, 377.0, 0.03},
		});
	}
	public ParTest(int actual , double esperado, double delta) {
		this.esperado = esperado;
		this.delta = delta;
		this.actual = actual;
	}
	
	@Before
	public void crearObj(){
		f = new Fibonacci();
	}
	@Test
	public void testEcuacion() {
		double res = f.getRecursiveFibonacci(actual);
		Assert.assertEquals(esperado,res, delta);
	}
}
