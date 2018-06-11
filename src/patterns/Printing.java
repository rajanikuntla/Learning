package patterns;


public class Printing {

	public static void main(String[] args) {
		print(10);
	}

	private static void print(int count) {
		if(count >  0) {
			System.out.println(count);
			print(count-1);
		}	
	}

}
