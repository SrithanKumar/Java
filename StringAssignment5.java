package in.neuron.assignment.strings;

public class StringAssignment5 {

	public static boolean countSpecialCharacters(char ch) {

		boolean check = false;

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			check = false;
		} else if (ch >= '0' && ch <= '9') {
			check = false;
		} else
			check = true;

		return check;
	}

	public static void main(String[] args) {
		String s = "This%is@a$String*With&Special^Character";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (countSpecialCharacters(s.charAt(i))) {
				count++;
			}
		}
		System.out.println("count: "+count);
	}
}
