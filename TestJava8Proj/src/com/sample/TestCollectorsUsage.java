package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCollectorsUsage {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dhoni","Merikom","PTUsha","PVSindhu","Sachin","VAnand","Sachin");
		
		/** Collecting to a List */
		List<String> list = names.stream().collect(Collectors.toList());
		System.out.println("Collected to List: " + list);
		
		/** Collecting to a Set */
		Set<String> set = names.stream().collect(Collectors.toSet());
		System.out.println("Collected to Set: " + set);
		
		/** Collecting to a Map */
		Map<String, Integer> map = names.stream().collect(Collectors.toMap(
				name -> name, 
				String::length,
				(existing, replacement) -> existing));
		System.out.println("Collected to Map: " + map);
		
		/** Joining Strings */
		String joiningString = names.stream().collect(Collectors.joining(", ->"));
		System.out.println("Joined String: " + joiningString);
		
	}

}
