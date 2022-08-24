package in.neuron.assignment.strings;

import java.util.Arrays;

public class StringAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Listen";
		String s2 = "Silent";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() == s2.length()) {

			char[] a = s1.toCharArray();
			char[] b = s2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);

			boolean result = Arrays.equals(a, b);
			if (result) {
				System.out.println("They are Anagram!!");
			} else {
				System.out.println("They are not Anagram!!");
			}
		} else {
			System.out.println("They are not Anagram!!");
		}
	}
}
