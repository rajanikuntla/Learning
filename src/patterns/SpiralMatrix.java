package patterns;

import java.util.Scanner;

public class SpiralMatrix {
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matrixOrder;
		
		matrixOrder = in.nextInt();
		int sq = matrixOrder *matrixOrder;
		int[] matrix = new int[sq] ;
		for(int i=0; i < sq  && in.hasNext(); i++) {
			matrix[i] =in.nextInt();
		}
		
		spriralMatrix(matrix, matrixOrder);
	}

	private static void spriralMatrix(int[] matrix, int matrixOrder) {
		boolean even = false;
		for(int i = 0, count = 0; i< matrixOrder *matrixOrder; i++, count++) {		
			if(count != 0 && count % matrixOrder == 0) {
				even = !even;
				System.out.println();
				if(even) 
					System.out.print("    " + matrix[i] + " ");
				else
					System.out.print(matrix[i] + " ");
				
			} else {
				System.out.print(matrix[i] + " ");
			}
			
		}
	}

}
