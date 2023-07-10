class Solution {
    public int solution(int a, int b) {
        
        String answer = Integer.toString(a) + Integer.toString(b);
        int ab = Integer.valueOf(answer);
        
        if(ab >= 2*a*b){
            return ab;
        }else
            return 2*a*b;
    }
}