package Lessons.BinaryGap;

/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros
that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
The number 20 has binary representation 10100 and contains one binary gap of length 1.
The number 15 has binary representation 1111 and has no binary gaps.
The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should
return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation
10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0,
because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
 */


import java.util.*;

public class Solution {
    public int Solution(long N){
        String BinaryRepresentationOfN = Long.toBinaryString(N);
        System.out.println(BinaryRepresentationOfN);


        int l = BinaryRepresentationOfN.length();
        boolean has0=false;


        //check if BinaryRep. has any 0
        for(int i=0; i<l-1;i++){
            if(BinaryRepresentationOfN.charAt(i)=='0') {
                has0=true;
                break;
            }
        }

        //check what number is the last in binary rep.
        ArrayList<String> partsAsList = new ArrayList<String>();
        String tempString = "";
        String longestString = "";

        if(has0==true && BinaryRepresentationOfN.charAt(l-1)=='1'){
            //System.out.println("1");
            String[] parts = BinaryRepresentationOfN.split("1");

            tempString = parts[0];
            for(int i=0; i<parts.length; i++){
                if(parts[i].length()>=tempString.length()){
                    tempString = parts[i];
                    longestString = tempString;
                }
            }

            return longestString.length();

        }
        else if(has0==true && BinaryRepresentationOfN.charAt(l-1)=='0') {
            //System.out.println("0");
            String[] parts = BinaryRepresentationOfN.split("1");

            tempString = parts[0];
            for(int i=0; i<parts.length-1; i++){
                if(parts[i].length()>=tempString.length()){
                    tempString = parts[i];
                    longestString = tempString;
                }
            }

            return longestString.length();


        }
     return 0;
    }
}


