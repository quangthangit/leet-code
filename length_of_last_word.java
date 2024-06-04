package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class length_of_last_word {
	public int lengthOfLastWord(String s) {
		int length = 0;
		int i = s.length() - 1;
		while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
			i--;
		}
		while (i >= 0 && !Character.isWhitespace(s.charAt(i))) {
			length++;
			i--;
		}
		return length;
	}
}
