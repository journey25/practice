import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 *
 * 만약 수열 A가 1, 3, 2, 6, 8 이라면
 * 수열 B는 1/1, (1+3)/2 , (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5
 * 즉, 1, 2, 2, 3, 4 가 된다.
 *
 * 수열 B가 주어졌을 때 수열 A를 구하는 프로그램을 작성하시오.
 *
 * input
 * 첫째줄에 수열 B의 길이를 나타내는 N이 주어진다.(1 <= N <= 100)
 * 두번째 줄에 수열 B를 구성하는 N개의 요소가 주어진다. Bi (1 <= Bi <= 10^9)
 *
 * output
 * 첫째 줄에 수열 A를 이루는 N개의 정수를 출력해라 (1 <= Ai <= 10^9)
 * NOTE : 수열 A의 요소들은 정수이다.
 *
 */
public class ProsjekTest {
	@Test
	public void prosject() {
		Prosjek prosjek = new Prosjek();
		String res = prosjek.calculate(4, "3 2 3 5");

		assertEquals("3 1 5 11", res);

	}
}
