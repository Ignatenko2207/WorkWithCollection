package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class ApplicationRunner {
	
	private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

	public static void main(String[] args) {
		
		String str1 = "str1";
		String str2 = "str2";
		String str3 = "str3";
		String str4 = "str4";
		
		Queue<String> strQueue = new PriorityQueue<>();
		
		strQueue.add(str1);
		strQueue.add(str2);
		strQueue.add(str3);
		strQueue.add(str4);
		
		List<String> strList = new ArrayList<>(strQueue);
		strList.add(str1);
		strList.add(str2);
		
		Set<String> strSet = new HashSet<>(strList);
		Set<String> strTreeSet = new TreeSet<>(strList);
		
		List<Integer> integers = Arrays.asList(1,2,3,5,3,4,8,7);
//		for (Integer integer : integers) {
//			System.out.print(integer);
//
//		}
//		System.out.println();
//		Collections.sort(integers);
//		
//		for (Integer integer : integers) {
//			System.out.print(integer);
//		}
//		System.out.println();
//		logger.info("Size of list is " + strList.size());
//		
//		logger.info("Size of set is " + strSet.size());
		
//		logger.info("Size of queue is " + strQueue.size());
//		
//		String element = strQueue.peek();
//		
//		logger.info("Size of queue after peek is " + strQueue.size());
//		
//		element = strQueue.poll();
//		
//		logger.info("Size of queue after poll is " + strQueue.size());
		
		
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("str1", 1234);
		logger.info(String.valueOf(myMap.get("str1")));

		myMap.put("str2", 1232);
		myMap.put("str3", 1233);
		myMap.put("str1", 4321);
		myMap.put(null, 5555);
		
		logger.info("Size of map is " + myMap.keySet().size());
		logger.info(String.valueOf(myMap.get("str1")));
		logger.info(String.valueOf(myMap.get(null)));
	}

}
