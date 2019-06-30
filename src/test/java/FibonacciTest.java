import algorithms.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 */
public class FibonacciTest {

	@Test
	public void fibonacci_when10() {
		Fibonacci fibonacci = new Fibonacci();

		assertEquals(55, fibonacci.cal(10));
	}

	@Test
	public void fibonacci_wheno0() {
		Fibonacci fibonacci = new Fibonacci();

		assertEquals(0, fibonacci.cal(0));
	}

}
