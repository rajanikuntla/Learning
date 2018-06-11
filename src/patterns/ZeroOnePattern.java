package patterns;

import java.util.Scanner;

public class ZeroOnePattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2 == 0 && j%2 !=0) {
					System.out.print(" 0 ");
				} else if(i%2 != 0 && j%2 == 0) {
					System.out.print(" 0 ");
				} else {
					System.out.print(" 1 ");
				}
			}
			System.out.println();
		}

	}

}
