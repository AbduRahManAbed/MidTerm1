package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> employees_of_mgt = new ArrayList();
		employees_of_mgt.add("emp1");
		employees_of_mgt.add("emp2");
		employees_of_mgt.add("emp3");

		List<String> employees_of_act = new ArrayList();
		employees_of_act.add("emp4");
		employees_of_act.add("emp5");
		employees_of_act.add("emp6");

		List<String> employees_of_sls = new ArrayList();
		employees_of_sls.add("emp7");
		employees_of_sls.add("emp8");
		employees_of_sls.add("emp9");


		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("mgt", employees_of_mgt);
		map.put("act", employees_of_act);
		map.put("sls", employees_of_sls);

		for (Map.Entry key : map.entrySet()) {
			System.out.println(key.getKey() + " " + key.getValue());
		}

		System.out.println("-----------------------------------------");

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
