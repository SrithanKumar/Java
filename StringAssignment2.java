package in.neuron.assignment.strings;

public class StringAssignment2 {
	public static void main(String []args) {
		String s=new String("Think Twice");
		String s1="";
		String []a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			s1=s1+a[i]+" ";
		}
		System.out.println(s1);
	}
}
