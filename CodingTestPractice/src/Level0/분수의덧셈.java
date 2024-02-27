package Level0;

import java.util.Arrays;

class Solution3 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        /*
        int denom3 = denom1 * denom2;

        numer1 *= denom2;
        numer2 *= denom1;
        int numer3 = numer1 + numer2;

        boolean isOK = true;
        int min = Math.min(numer3, denom3);
        int common = 0;

        for (int i = 2; i <= min; i++) {
            if (numer3 % i == 0 && denom3 % i == 0) {
                isOK = false;
                common = i;
            }
        }

        if (isOK) {
            int[] result = {numer3, denom3};
            return result;
        } else {
            numer3 /= common;
            denom3 /= common;
            int[] result = {numer3, denom3};
            return result;
        }
         */

        int[] result = new int[2];

        if (denom1 == denom2) {
            result[0] = numer1 + numer2;
            result[1] = denom1;
        } else {
            result[0] = numer1 * denom2 + numer2 * denom1;
            result[1] = denom1 * denom2;
        }

        int gcd = 1;
        int min = Math.min(result[0], result[1]);

        for (int i = 2; i <= min; i++) {
            if (result[0] % i == 0 && result[1] % i == 0) {
                gcd = i;
            }
        }

        if (gcd != 1) {
            result[0] /= gcd;
            result[1] /= gcd;
            return result;
        } else {
            return result;
        }
    }
}

public class 분수의덧셈 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        Solution3 solution3 = new Solution3();
        System.out.println(Arrays.toString(solution3.solution(numer1, denom1, numer2, denom2)));
    }
}
