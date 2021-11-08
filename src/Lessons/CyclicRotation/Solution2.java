package Lessons.CyclicRotation;


import java.util.*;


//this solution doesn't need if-s but it uses java.util lib.
public class Solution2 {

    public int[] solution2(int[] A, int K) {

        ArrayList<Integer> arrayListA = new ArrayList<>();

        for(int i=0; i<A.length; i++){
            arrayListA.add(A[i]);
        }

        Collections.rotate(arrayListA,K);

        for(int i=0; i<A.length; i++){
            A[i] = arrayListA.get(i);
        }

        return A;
    }

}
