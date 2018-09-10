package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<String>();
		student.add("A");
		student.add("B");
		student.add("C");
		student.add("D");
		System.out.println("values of the array = " + student);

		for (int a = 1; a < 3; a++) {
			System.out.println("index to index = " + student.get(a));
		}

	}

}
