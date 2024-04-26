package Level1;

import java.util.Arrays;

class Solution38 {
    public String solution(String X, String Y) {
        StringBuffer sb = new StringBuffer();

        char[] arrX = X.toCharArray();
        char[] arrY = Y.toCharArray();

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arrX.length; i++) {
            arr1[arrX[i] - '0']++;
        }

        for (int i = 0; i < arrY.length; i++) {
            arr2[arrY[i] - '0']++;
        }

        for (int i = 0; i < arr1.length; i++) {
            int count = Math.min(arr1[i], arr2[i]);
            if (count != 0) {
                while (count > 0) {
                    sb.append(i);
                    count--;
                }
            }
        }

        String[] s = sb.toString().split("");
        sb.delete(0, sb.length());
        Arrays.sort(s);

        for (String s1 : s) {
            sb.append(s1);
        }

        if (sb.toString().equals("")) {
            return "-1";
        }

        if (sb.reverse().toString().startsWith("0")) {
            return "0";
        }

        return sb.toString();
    }
}

public class 숫자짝꿍 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        String X = "100";
        String Y = "123450";
        System.out.println(solution38.solution(X, Y));
    }
}
