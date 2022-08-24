package in.neuron.assignment.strings;

class IsPangram {
	public static void isPangram(String s) {
		s = s.toLowerCase();
		boolean check = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!s.contains(String.valueOf(ch))) {
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Yes");
		} else
			System.out.println("no");
	}
}

public class StringAssignment4 {
	public static void main(String[] args) {
		String str = "Abcdefghijklmnopqrstuvwxyz12";
		IsPangram.isPangram(str);
	}
}
