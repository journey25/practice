import algorithms.FractionSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 *
 * 분자 분모가 모두 자연수인 두 분수의 합 또한 분자 분모가 자연수인 분수로 표현할 수 있다.
 * 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.
 * 기약분수란 더 이상 약분되지 않는 분수를 의미한다.
 *
 * input
 * 첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다.
 * 입력되는 네 자연수는 모두 30,000 이하이다.
 *
 *
 * output
 * 첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 공백으로 구분하여 순서대로 출력한다.
 *
 *
 */
public class FractionSumTest {

	@Test
	public void fractionSum() {
		FractionSum fractionSum = new FractionSum();

		String[] nums = new String[2];
		nums[0] = "2 7";
		nums[1] = "3 5";

		assertEquals("31 35", fractionSum.cal(nums));
	}
}
