/*
* String operations
Problem Description

Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints
1<=N<=100000


Input Format
First argument is a string A of size N.



Output Format
Return the resultant string.



Example Input
A="AbcaZeoB"



Example Output
"bc###bc###"



Example Explanation
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#'.
A becomes "bc###bc###".
* */


package com.company.DSAlgo;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println ( solve ( "AbcaZeoB" ) );
    }

    public static String solve(String A) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<A.length();i++){
            if(!(A.charAt(i)>=65&&A.charAt(i)<=90)){
                if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'){
                    str=str.append("#");
                }else{
                    str=str.append(A.charAt(i));
                }
            }
        }
        return (str.append(str)).toString();
    }
}
