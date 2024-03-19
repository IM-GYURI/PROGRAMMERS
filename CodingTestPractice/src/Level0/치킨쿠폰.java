package Level0;

class Solution12 {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (true) {
            if (coupon >= 10) {
                chicken = coupon / 10;
                answer += chicken;
                coupon = chicken + coupon % 10;
            } else {
                break;
            }
        }

        return answer;
    }
}

public class 치킨쿠폰 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int chicken = 100;
        System.out.println(solution12.solution(chicken));

        chicken = 1081;
        System.out.println(solution12.solution(chicken));
    }
}
