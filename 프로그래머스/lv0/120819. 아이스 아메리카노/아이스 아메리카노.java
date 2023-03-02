class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        if(money > 0 && money <= 1000000){
            int americano = money / 5500;
            answer[0] = americano;
            money = money - (5500 * americano);
            answer[1] = money;
        }else{
            System.out.println("제한된 범위를 벗어났습니다.");
        }
        
        return answer;
    }
}