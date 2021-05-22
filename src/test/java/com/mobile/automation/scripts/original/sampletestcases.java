package com.mobile.automation.scripts.original;

public class sampletestcases {
	
	public static void main (String[] args) 
	{ 
		String input = "1??0?101"; 
		char[] str = input.toCharArray(); 
		series(str, 0); 
	} 
	public static void series(char str[], int index) 
	{ 
		if (index == str.length) 
		{ 
			System.out.println(str); 
			return; 
		} 

		if (str[index] == '?') 
		{ 
			
			str[index] = '0'; 
			series(str, index + 1); 
			
			
			str[index] = '1'; 
			series(str, index + 1); 
			
			
			str[index] = '?'; 
		} 
		else
			series(str, index + 1); 
	} 

}
