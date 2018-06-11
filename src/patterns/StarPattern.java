package patterns;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int rows = in.nextInt();		
//		int tempSpaces=0;
		for(int i=1; i<= rows; i++) {
			
			printStars(i,rows,false, false);
			printStars(i,rows,true, false);
			printStars(i,rows,true, true);
			printStars(i,rows,false, true);
			System.out.println();
		}
		

	}
	
	public static void printStars(int nthRow, int rows, boolean inverted, boolean flipped) {
		
		boolean cond1 = (!inverted && !flipped) || (inverted && flipped);
		
		for(int i = cond1? 1 : rows; cond1? i<=rows : i>0 ; i = cond1 ? i+1 : i-1) {
			if(i<=nthRow && !inverted)
				System.out.print("*");
			else if(inverted && i >= nthRow)
				System.out.print("*");
			else
				System.out.print(" ");
		}
	}

}
