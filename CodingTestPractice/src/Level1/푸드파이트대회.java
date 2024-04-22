package Level1;

class Solution30 {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 1) {
                food[i] = food[i] / 2 * 2;
            }
        }

        for (int i = 1; i < food.length; i++) {
            sb.append((i + "").repeat(food[i] / 2));
        }

        sb.append("0");
        answer = sb.toString() + sb.reverse().deleteCharAt(0).toString();

        return answer;
    }
}

public class 푸드파이트대회 {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        int[] food = {1, 3, 4, 6};
        System.out.println(solution30.solution(food));
    }
}
