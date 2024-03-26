package Level2;

class Solution23 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (target == sum) {
                answer++;
            }
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}

public class 타겟넘버 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution23.solution(numbers, target));

        numbers = new int[]{4, 1, 2, 1};
        target = 4;
        System.out.println(solution23.solution(numbers, target));
    }
}
