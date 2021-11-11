package Lessons.TapeEquilibrium;

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */

class Solution {
    public int solution(int[] A) {

        int part1=0;
        int part2=0;
        int sumOfArray=0;
        int difference=0;
        int minDifference = Integer.MAX_VALUE;

        for(int a:A){
            sumOfArray+=a;
        }

        for(int i=0; i<A.length-1; i++){
            part1+=A[i];
            part2=sumOfArray-part1;
            difference=Math.abs(part1-part2);
            // System.out.println("sumOfArray: " +sumOfArray + "\n"+
            //                    "part1: "+part1 + "\n" +
            //                    "part2: "+part2 + "\n" +
            //                    "difference: "+difference);
            // System.out.println();

            if(Math.abs(difference)<=Math.abs(minDifference)){
                minDifference=difference;
            }
        }

        return minDifference;
    }
}
