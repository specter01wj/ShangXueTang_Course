package com.accenture.spm.oop;

import java.util.Arrays;

public class TestArrayTable {

	public static void main(String[] args) {
		
		Object[] emp1 = {1001, "James", 23, "Engineer", "2016-02-13" };
		Object[] emp2 = {1002, "Kim", 27, "Accountant", "2014-06-11" };
		Object[] emp3 = {1003, "George", 34, "Manager", "2008-11-01" };
		
		Object[][] tableData = new Object[3][];
		tableData[0] = emp1;
		tableData[1] = emp2;
		tableData[2] = emp3;
		
		System.out.println(Arrays.deepToString(tableData));
		
		for(Object[] temp : tableData) {
			System.out.println(Arrays.toString(temp));
		}
		
	}
	
}
