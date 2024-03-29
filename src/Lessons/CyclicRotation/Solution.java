package Lessons.CyclicRotation;

/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */

public class Solution {
    public int[] solution(int[] A, int K){

        int[] rotatedA = new int[A.length];

        if (A.length==0) return A;
        if (K==0) return A;

        if(A.length!=1){
            for(int i=0; i<K; i++) {

                //rotate last space in A (in Arrays, we cant define A[-1] index).
                rotatedA[0] = A[A.length - 1];

                //rotate rest of the numbers.
                for (int j = 0; j < A.length - 1; j++) {
                    rotatedA[j + 1] = A[j];
                }

                //if there is more than 1 iteration then A needs to be rotatedA for next iteration.
                //otherwise it'll rotate 3x1 times initial Array.
                for (int k = 0; k < A.length; k++) {
                    A[k] = rotatedA[k];
                }
            }
        } else {
            rotatedA[0] = A[0];
        }

//        for(int i=0; i<A.length; i++) {
//            System.out.println(rotatedA[i]);
//        }


        return rotatedA;
    }

}
