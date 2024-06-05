package leetcode;


public class palindrome_number {
	public boolean isPalindrome(int x) {
		int count = 0;
		String s = String.valueOf(x);
		if(s.length() % 2 == 1) {
			for(int i=s.length()/2+1;i<s.length();i++) {
				if(s.charAt(i) == s.charAt(s.length()-i-1)) {
					count++;
				} else {
					return false;
				}
			}
			if(count == s.length()/2) {
				return true;
			} else {
				return false;
			}
		} else {
			for(int i=s.length()/2;i<s.length();i++) {
				if(s.charAt(i) == s.charAt(s.length()-i-1)) {
					count++;
				} else {
					return false;
				}
			}
			if(count == s.length()/2) {
				return true;
			} else {
				return false;
			}
		}
	}
}
