package com.prasad.practice.strings;

import java.util.Arrays;

public class StringLoop {
	public static void main(String[] args) {
		String str="MaytaS";
		//logic for printing reverse string characters 
		char[] cc=str.toCharArray();
		System.out.println(str.toCharArray());
		System.out.println(Arrays.toString(str.toCharArray()));
		for(char c:str.toCharArray()){
			 System.out.println("-"+c);
		}
    		 }

}
