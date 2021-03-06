package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	 Emily has been given an assignment to check if all the letters of the English Alphabet
	 are present in the given sentence or not. Help her recognize it by writing a code. You
	 can ignore cases i.e no case-sensitivity required.

     Example: "We promptly judged antique ivory buckles for the next prize"
     The string contains all letters in the English alphabet.
     Input Format
     A single line with string s.
     Constraints
     0 < length of s < 1000
     Output Format
     Print "Yes" in case it contains all letters of English alphabet otherwise "No"
     Sample Input 0
     Pack my box with five dozen liquor jugs
     Sample Output 0
     Yes
     Sample Input 1
     Sympathizing would fix objectives.
	 */
        String str = "Pack my box with five dozen liquor jugs";
        stringCheck(str);
    }
    public static void stringCheck(String str){
        // will lowercase the alphabets of string in lowercase alphabet.
        String str1 = str.toLowerCase();
        int c=1;
        for(char i='a';i<='z';i++){
            String s = Character.toString(i);
            // come out of condition if it becomes false.
            if(str1.contains(s)==false){
                c=0;
                break;
            }
        }
        if(c==0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
