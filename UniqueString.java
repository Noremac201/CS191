import java.util.HashSet;
import java.util.Set;

public class UniqStr {

	public static Integer checkString(String str_test) {
		char[] char_array = str_test.toCharArray();
		Set<Character> char_hash = new HashSet<Character>();
		for (char ch : char_array) {
			if (char_hash.contains(ch)) {
				return 1;
			} else {
				char_hash.add(ch);
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		if (checkString(args[0]) == 0) {
			System.out.println("String is unique");
		} else {
			System.out.println("String is not unique");
		}

	}
}
