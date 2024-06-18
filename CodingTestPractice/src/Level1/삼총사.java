package Level1;

// 조합 -> 실패

class Solution46 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0)
                        answer++;
                }
            }
        }

        return answer;
    }
}

public class 삼총사 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int[] numbers = {-2, 3, 0, 2, -5};
        System.out.println(solution46.solution(numbers));
    }
}
