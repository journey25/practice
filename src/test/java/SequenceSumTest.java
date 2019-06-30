import algorithms.SequenceSum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 *
 * 옛날 옛적에, N개의 양의 정수를 가지는 수열 A가 있었다.
 * 당신은 수열 자체를 알지는 못하지만 수열의 두 요소의 합은 알 수 있다. 수열 A를 찾아라!
 *
 * input
 * 첫째 줄에 양의 정수 N이 주어진다. (3 <= N <= 1000 ) N개의 줄에 N개의 양의 정수가 TABLE S로 주어진다.
 * 각 정수들은 100000 이하이다. TABLE S i, j 는 A i +A j 의 관계가 있다.
 * (i 는 j와 같지 않을 경우에만 해당하고, 만약 i 와 j가 같다면 S i, j = 0 이다.)
 * S i, j 는 테이블에서 i번째 row와 j번째 column을 의미한다.
 * 그리고 A i 는 수열 A의 i번째 요소를 의미한다.
 * 어떤 입력 값에 대해서 양의 정수 수열 A는 단 하나 뿐임이 보장된다.
 *
 *
 * output
 * 첫째줄에 수열 A를 출력한다. (N개의 양의 정수를 공백을 가지고 출력한다.)
 *
 *
 * source
 * COCI 2012/2013 Contest #6 2번
 *
 */
public class SequenceSumTest {
	@Test
	public void sequenceSum_2145() {
		SequenceSum sequenceSum = new SequenceSum();
		List<String> inputs = new ArrayList<String>();

		inputs.add("4");
		inputs.add("0 3 6 7");
		inputs.add("3 0 5 6");
		inputs.add("6 5 0 9");
		inputs.add("7 6 9 0");
		assertEquals(Integer.parseInt(inputs.get(0)) + 1, inputs.size());
		assertNotNull(sequenceSum.sum(inputs));
		assertEquals("2 1 4 5", sequenceSum.sum(inputs));
	}

	@Test
	public void sequenceSum_367() {
		SequenceSum sequenceSum = new SequenceSum();
		List<String> inputs = new ArrayList<String>();

		inputs.add("3");
		inputs.add("0 9 10");
		inputs.add("9 0 13");
		inputs.add("10 13 0");
		assertEquals(Integer.parseInt(inputs.get(0)) + 1, inputs.size());
		assertNotNull(sequenceSum.sum(inputs));
		assertEquals("3 6 7", sequenceSum.sum(inputs));
	}
}
