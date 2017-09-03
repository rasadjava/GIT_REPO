package com.prasad.practice.strings;

public class StringExamples {

	public static void main(String[] args) {
		
		// String immutability
		//Reason for string immutable to optimize the memory
		String s1 = "Java";
		System.out.println("===1===" + s1);
		s1.toUpperCase();
		System.out.println("===2===" + s1);
		String s2 = s1.toUpperCase();
		System.out.println("===3===" + s2);
		// String immutability

		// String constant pool
		String s3 = "CtoN";// cashed in string pool
		String s4 = "Jar";// here it will refers to same "Java" of s3 reference
		String s5 = new String("Jar").intern();// this string is not interned (.intern())
		String s6 = new String("Jar").intern();
		boolean b=(s3==s4);
		System.out.println("===4=== "+(s5==s4) );
		System.out.println("===5=== " + (s5==s6));
		// String constant pool
		
		//String methods
		String s7=new String("Welcome to Java");
		System.out.println("===6===" +s7.toLowerCase());
		System.out.println("===7===" +s7.length());
		System.out.println("===8===" +s7.replace("Java", "Oka"));
		System.out.println("===9===" +s7.indexOf("o"));
		System.out.println("===10===" +s7.charAt(11));
		//String methods
		
	}

}