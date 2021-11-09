package Lessons.FrogJmp;

class Solution {
    public int solution(int X, int Y, int D) {
        double distance  = Y-X;
        int jumps = (int)Math.ceil(distance/(double)D);

        return jumps;
    }
}
