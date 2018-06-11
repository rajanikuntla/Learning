package patterns;

import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		repeatedCharecters(sentence);
	}

	private static void repeatedCharecters(String sentence) {
		int[] chars = new int[26];
		sentence = sentence.replaceAll(" ", "").toLowerCase();
		for(char ch : sentence.toCharArray()) {
			++chars[ch -'a'] ;
		}
		
		for(int i=0; i<26; i++) {
			if(chars[i] > 1)
			System.out.print((char)(i + 'a'));
		}
		
	}

}
