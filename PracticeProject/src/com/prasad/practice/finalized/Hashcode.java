package com.prasad.practice.finalized;

public class Hashcode {
	public static void main(String[] args) {
 String str1="Cat";
 String str2="Cat";
 System.out.println(str1==str2);
 System.out.println(str1.equals(str2));
	}

}
String str="MaytaS";
//Using charAt() and length() string methods
//logic for printing string characters
for(int i=0;i<=str.length()-1;i++){
	 System.out.print(str.charAt(i));
}
System.out.println("\n*");

//logic for printing reverse string characters 
for(int j=str.length()-1;j>=0;j--){
	 System.out.print(str.charAt(j));
}
//for each loop
for(char c:str.toCharArray()){
	 System.out.println("-"+c);
}
//while loop
int k=0;
while(str.length()>5){
	 System.out.println("==while loop=="+str.length());
	 k++;
	 if(k==3){
		 break;
	 }
}
//do while loop
int l=0;
do{
	 System.out.println("==do while loop=="+str.length());
	 l++;
	 if(l==3)
		 break;
}while(str.length()>4);

