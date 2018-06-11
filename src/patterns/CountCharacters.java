package patterns;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		String givenString = in.nextLine();
		String input = in.nextLine();
		char givenChar = input.charAt(0);
		int result = countCharacters(givenString, givenChar);
		System.out.println(result);

	}

	private static int countCharacters(String givenString, char givenChar) {
		
		int characterIndex = givenString.indexOf(givenChar);
		if(characterIndex != -1) {
			return countCharacters(givenString.substring(++characterIndex), givenChar) + 1;
		}
		
		return 0;
	}

	

}
