package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class largest_number {
	public String largestNumber(int[] nums) {
		String[] strNums = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
		Arrays.sort(strNums, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				String order1 = a + b;
				String order2 = b + a;
				return order2.compareTo(order1); 
			}
		});
		String result = String.join("", strNums);

		if (result.startsWith("0")) {
			result = "0";
		}
		return result;
	}
}
