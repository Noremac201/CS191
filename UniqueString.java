/*****
* @description Find if String has all unique characters.
*/

import java.util.HashMap;
import java.util.Map;

public class UniqStr {
	public static void main(String[] args) {
		String str_test = "abcd9fg";
		int end = 0;

		char[] char_array = str_test.toCharArray();
		Map<Character, Integer> char_hash = new HashMap<Character, Integer>();
		for (char ch : char_array) {
			if (char_hash.containsKey(ch)) {
				end = -1;
			} else {
				char_hash.put(ch, 1);
			}
		}
		if (end == -1) {
			System.out.println("String is not unique");
		} else {
			System.out.println("String is unique");
		}
	}
}
