// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// Author: BERK ECER

class Solution {
    public static int solution(int N) {
		// convert integer to its binary representation string
        String binaryStringOfInt = Integer.toBinaryString(N);
        String divider = "-";
        
        // then split the string by using regex (1+ : one or more 1) 
        binaryStringOfInt = binaryStringOfInt.replaceAll("1+", divider + "1" + divider);

        // we add divider before and after of each ones because after the split we need to decide is it a gap or not
        // for ex: -000- is a gap but -000 is not a gap, we are understanding this by looking dashes ("-") 
        String[] pieces = binaryStringOfInt.split("1");
        // then find and return the length of longest piece
        int max =  0;
        for (String s : pieces) {
        	
        	if (s.length()> 2 && s.startsWith("-") && s.endsWith("-")) {
        		if(s.length() > max) {
        			max = s.length() - 2;
    			}
			}
			
		}
		return max;
	}
}