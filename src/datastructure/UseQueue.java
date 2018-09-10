package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> states = new LinkedList<>();
		states.add("california");
		states.add("Virginia");
		states.add("Texas");
		states.add("NewYork");
		System.out.println("peek : "+states.peek());
		System.out.println("remove : "+states.remove());
		System.out.println("poll : "+states.poll());
		for(String x : states ){
			System.out.println("for loop : "+x);
		}
		Iterator it = states.iterator();
		while(it.hasNext()){
			System.out.println("Iterator : "+it.next());
		}


	}
}


