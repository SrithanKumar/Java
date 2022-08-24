package in.neuron.assignment.strings;

public class StringAssignment6 {
		public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		int vowel=0;
		int cons=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowel++;
			}else
				cons++;
		}
		System.out.println("vowelCount: "+vowel);
		System.out.println("ConsonantCount: "+cons);
		}
}
