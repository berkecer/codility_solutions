import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


// Author: BERK ECER


public class Main {

	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		
		System.out.println(Arrays.toString(solution(A, K)));
	}

	public static int[] solution(int[] A, int K) {

		// Reversed Queue is used in this solution

		Queue<Integer> stacks = new LinkedList<Integer>();
		
		// fill the stack REVERSED
		for (int i = A.length - 1; i >= 0; i--) {
			stacks.add(A[i]);
		}
		
		System.out.println(Arrays.toString(stacks.toArray()));
		// rotate
		for (int i = 0; i < K; i++) {
			if(stacks.size() >= 1) {
				int tempRemoved = stacks.remove();
				stacks.add(tempRemoved);
			}
			System.out.println(Arrays.toString(stacks.toArray()));

		}
		
		// Load the stack AGAIN REVERSED
		int counter = A.length - 1;
		for (Integer integer : stacks) {
			A[counter] = integer;
			counter--;
		}
		
		return A;
	}


}
