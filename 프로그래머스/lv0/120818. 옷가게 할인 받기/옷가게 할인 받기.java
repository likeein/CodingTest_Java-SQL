class Solution {
    public int solution(int price) {
        
        double sale = 0;
        
        if(price >= 10 && price <= 1000000){
            if (price >= 100000 && price < 300000){
                sale = price * 0.05;
                price = (int) (price - sale);
            }else if(price >= 300000 && price < 500000){
                sale = price * 0.1;
                price = (int) (price - sale);
            }else if(price >= 500000){
                sale = price * 0.2;
                price = (int) (price - sale);
            }else{
                System.out.println("10원 이상 100만원 이하의 가격을 입력해주세요.");
            }
        }else{
            System.out.println("10만원 이상 구매해야 할인 가능합니다.");
        }
        
        return price;
    }
}