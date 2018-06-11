package patterns;

import java.util.Scanner;

public class IncrementalPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int spaces = rows;
		
		for(int i =1; i<=rows; i++) {
			spaces--;
			for(int j=spaces;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<= i; k++) {
				System.out.print(k + " ");
			}
			
			System.out.println();
		}
		
		spaces++;
		
		for(int i =rows-1; i>0; i--) {
			for(int j=spaces;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<= i; k++) {
				System.out.print(k + " ");
			}
			spaces++;
			System.out.println();
		}

	}

}
