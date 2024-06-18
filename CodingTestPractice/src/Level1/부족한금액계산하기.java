package Level1;

class Solution49 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int num = 1;

        while (count > 0) {
            answer += price * num;
            num++;
            count--;
        }

        return (money >= answer) ? 0 : answer - money;
    }
}

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution49.solution(price, money, count));
    }
}
