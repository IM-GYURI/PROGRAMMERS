package Level1;

class Solution20 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class 소수만들기 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution20.solution(nums));

        nums = new int[]{1, 2, 7, 6, 4};
        System.out.println(solution20.solution(nums));
    }
}
