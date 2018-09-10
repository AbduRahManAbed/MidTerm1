package math.problems;

import java.util.ArrayList;

public class Pattern {
	static int cntA = 1;
	static int cntB = 10;
	static int cntC = 0;
	static int currentNum = 100;

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

