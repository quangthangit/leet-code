package leetcode;

import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_characters {
	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, i = 0, t = 0;
        while (i < s.length()) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(t++));
            } else {
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
