package com.accenture.spm.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStoreData {

	public static void main(String[] args) {
		
		Map<String, Object> row1 = new HashMap<>();
		row1.put("id", 1001);
		row1.put("name", "James");
		row1.put("salary", 20000);
		row1.put("date", "05/13/2015");
		
		Map<String, Object> row2 = new HashMap<>();
		row2.put("id", 1002);
		row2.put("name", "Kate");
		row2.put("salary", 15000);
		row2.put("date", "10/23/2016");
		
		Map<String, Object> row3 = new HashMap<>();
		row3.put("id", 1003);
		row3.put("name", "Kim");
		row3.put("salary", 30000);
		row3.put("date", "06/07/2008");
		
		List<Map<String, Object>> table1 = new ArrayList<>();
		table1.add(row1);
		table1.add(row2);
		table1.add(row3);
		
		for(Map<String, Object> row : table1) {
			Set<String> keyset = row.keySet();
			for(String key : keyset) {
				System.out.print(key + ":" + row.get(key) + "\t");
			}
			System.out.println();
		}
		
	}
	
}
