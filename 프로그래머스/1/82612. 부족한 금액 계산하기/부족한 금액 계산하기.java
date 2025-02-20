class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
         for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        // 총 비용에서 가진 돈을 빼서 부족한 금액을 구함
        long difference = answer - money;

        // 돈이 부족하면 부족한 금액 반환, 부족하지 않으면 0 반환
        if (difference > 0) {
            return difference;
        } else {
            return 0;
        }
    }
}

      