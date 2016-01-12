import java.util.HashSet;
import java.util.Set;

public class UniqStr {
	public static void main(String[] args) {
		String str_test = args[0];
		int end = 0;
		int checker = 0;

		char[] char_array = str_test.toCharArray();
		Set<Character> char_hash = new HashSet<Character>();
		for (char ch : char_array) {
			if (char_hash.contains(ch)) {
				end = -1;
				checker = -1;
				break;
			} else {
				char_hash.add(ch);
			}
		}
		if (end != -1 && checker == -1) {
			System.out.println("String is not unique");
		} else {
			System.out.println("String is unique");
		}
	}
}
