package com.accenture.spm.oop;

public class TestArrayCopy {

	public static void main(String[] args) {
		
		testBasicCopy();
		testBasicCopy2();
		
	}
	
	public static void testBasicCopy() {
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		String[] s2 = new String[10];
		
		System.arraycopy(s1, 2, s2, 6, 3);
		
		for(int i = 0; i < s2.length; i++) {
			System.out.println(i + "--" + s2[i]);
		}
	}
	
	public static void testBasicCopy2() {
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		//String[] s2 = new String[5];
		
		System.arraycopy(s1, 3, s1, 3-1, s1.length - 3);
		s1[s1.length - 1] = null;
		
		for(int i = 0; i < s1.length; i++) {
			System.out.println(i + "--" + s1[i]);
		}
	}
	
	public static String[] testBasicCopy3(String[] s,int index) {
		//String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		//String[] s2 = new String[5];
		
		System.arraycopy(s, index, s, index-1, s.length - index);
		s[s.length - 1] = null;
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(i + "--" + s[i]);
		}
		
		return s;
	}
	
}
