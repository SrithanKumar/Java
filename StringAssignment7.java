package in.neuron.assignment.strings;

import java.util.Arrays;

public class StringAssignment7 {

	public static void main(String[] args) {
		String s="XTendulkar";
	
		//ss.toLowerCase();
		int temp;
		char[]str=s.toCharArray();
		int size=str.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(str[i]>str[j]) {
					temp=str[i];
					str[i]=str[j];
					str[j]=(char)temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(str));
	}
}
