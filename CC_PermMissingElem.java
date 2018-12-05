public class Main {

	// Author: BERK ECER
	public static void main(String[] args) {

		int[] A = { 2, 3, 1, 5 };
		System.out.println("Missing Num: " + solution(A));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		// calculate the total value for n + 1 with sum formula ((n) * (n +1)) /2   in our case 
		// because of missing element we need to assume n = n + 1 
		int total = ((A.length + 1) * (A.length + 2)) / 2 ;
		
		// subtract each element 
		for (int i : A) {
			total -= i;
		}
		
		 // the total value will be the missing value after subtractions
		
		return total;
		
	}

}
