package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
	
	public Integer numberOfSymptoms;
		
	Map<String, Integer> hm = new HashMap<>();
	TreeMap<String, Integer> sort = new TreeMap<>(hm);
	
	
	public void showLine (String line) {
		numberOfSymptoms++;		
	}
	
	
	public void  countSymptoms (String line) {	
		Integer newValue = 0;
		Integer actualValue = hm.get(line);
		
		if (actualValue == null) {
			newValue++;
		} else {
			newValue = actualValue +1;	
		}
		
		hm.put(line, newValue);
		sort.put(line, newValue);
	}
	
	
	public MyMap() {
		numberOfSymptoms = 0;
	}
}


