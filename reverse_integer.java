package leetcode;

public class reverse_integer {
	public int reverse(int x) {
		boolean isCheck = x < 0;
		String s = isCheck ? String.valueOf(-x) : String.valueOf(x);
		String reverse = new StringBuffer(s).reverse().toString();
		try {
			int reverseInt = Integer.parseInt(reverse);
			return isCheck ? -reverseInt : reverseInt;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
