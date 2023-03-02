class Solution {
    public int solution(int age) {
        int answer = 0;
        int i = 0; //나이 차 구하는 변수
        
        if(age > 0 && age <= 120){
            i = age - 1 ; //2022냔 기준 (1살) 에서 나이차 구하기
            answer = 2022 - i ;
        }
        
        return answer;
    }
}