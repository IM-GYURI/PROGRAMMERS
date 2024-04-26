package Level1;

import java.util.Arrays;

class Solution36 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] weapon = new int[number];

        for (int i = 1; i <= number; i++) {
            weapon[i - 1] = count(i);
        }

        System.out.println(Arrays.toString(weapon));

        for (int i = 0; i < weapon.length; i++) {
            if (weapon[i] > limit) {
                weapon[i] = power;
            }
        }

        answer = Arrays.stream(weapon).sum();

        return answer;
    }

    public int count(int n) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }

            if (n / (double)i == (double)i) {
                count--;
            }
        }

        return count;
    }
}

public class 기사단원의무기 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution36.solution(number, limit, power));
    }
}
