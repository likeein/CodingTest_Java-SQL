class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] result = new int[2];
        // 분모의 최소공배수를 구한다.
        result[0] = denum1*num2 + denum2*num1;
        result[1] = num1*num2;
        int min = (result[0] > result[1])? result[0]: result[1];
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (result[0] % i == 0 && result[1] % i == 0)
                gcd = i;
        }
        result[0] = result[0]/gcd;
        result[1] = result[1]/gcd;

        return result;
    }
}