package Pattern;

/*
 
1111
222
33
4
  
 */

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		int n=4;
		int counter = 1;
		for (int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(counter);
			}
			System.out.println();	
			counter++;
		}
		
	}
}
