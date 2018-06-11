package patterns;

import java.util.Scanner;

public class PercentageCounter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		percentageCounter(string);
	}

	private static void percentageCounter(String string) {
		char[] str = string.toCharArray();
		int upp=0, low=0, digits=0, spc=0;
		int total = str.length;
		for(int i=0; i<total; i++) {
			if(Character.isUpperCase(str[i])) {
				++upp;
			}else if(Character.isLowerCase(str[i])) {
				++low;
			}else if(Character.isDigit(str[i])) {
				++digits;
			}else {
				++spc;
			}
		}
		
		System.out.println("Upper Case % =" + (float)upp/total *100);
		System.out.println("Lower Case % =" + (float)low/total * 100);
		System.out.println("Digit % =" + (float)digits/total * 100);
		System.out.println("Special characters % =" + (float)spc/total * 100);
		
	}

}
