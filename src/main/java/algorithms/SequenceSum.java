package algorithms;

import java.util.List;

/**
 * @author jiyouneo
 * @since 2019. 06. 30
 */
public class SequenceSum {
	public String sum(List<String> inputs) {
		int num = Integer.parseInt(inputs.get(0));

		int n = 0;
		int x = 0;
		int p = 0;
		int[] first = new int[num];
		for (int i = 0; i < num; i++) {
			int get = i;
			String[] lines = inputs.get(get).split(" ");

			if (i == 0) {
				continue;
			}

			for (int j = 0; j < lines.length; j++) {
				// j = 0 && i == j

				// 따로 저장
				if (i == 1) {
					first[j] = Integer.parseInt(lines[j]);
				}

				if (j != 0 && i != 1 && i != (j + 1)) {
					if (n > 0) {
						break;
					}
					n = Integer.parseInt(lines[j]);
					p = j;
				}
			}

			if (n > 0) {
				x = Math.abs((first[p - 1] + first[p]) - n) / 2;
				break;
			}

		}

		String res = x + " ";
		for (int i = 1; i < first.length; i++) {
			res += (first[i] - x) + " ";
		}

		return res.substring(0, res.length() - 1);
	}
}
