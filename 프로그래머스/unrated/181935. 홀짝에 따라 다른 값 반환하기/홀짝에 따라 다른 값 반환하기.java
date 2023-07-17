class Solution {
    public int solution(int n) {
        int sum = 0;
        
        if(n % 2 == 1){
            for(int i = 1; i <= n; i=i+2){
            
                sum += i;
            }
        }
        else{
            for(int i = 2; i <= n; i=i+2){
                
                int sum2 = 0;
                sum2 = i*i;
                sum += sum2;
            }
        }
        
        return sum;
    }
}