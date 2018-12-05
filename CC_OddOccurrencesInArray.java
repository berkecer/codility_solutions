import java.util.HashMap;
// Author: BERK ECER
public class Main {

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println("Odd count: " + solution(A));
	}

	public static int solution(int[] A) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i : A) {
			if(!hash.containsKey(i)) { // if it is not contains the key
				hash.put(i, 1);
			}else { // contains the key
				hash.remove(i);
			}
		}
		
		// At this stage only unpaired element should be in hash
		for (int i : hash.keySet()) {
			return i;
		}
		
		// Error code
		return 999;
	}

}
