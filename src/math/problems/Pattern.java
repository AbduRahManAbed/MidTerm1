package math.problems;

import java.util.ArrayList;

public class Pattern {
	private static int cntA = 1;
	private static int cntB = 10;
	private static int cntC = 0;
	private static int currentNum = 100;

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();

		while(currentNum > 0){
			if(cntC < cntB){
				numbers.add(currentNum);
				currentNum -= cntA ;
				cntC+= cntA;
			} else {
				cntA++;
				cntC = 0;
				cntB = cntB + 10;
			}
		}
		System.out.println(numbers.toString());
	}
}

