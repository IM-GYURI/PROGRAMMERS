package Level2;

class Solution34 {
    public String solution(String number, int k) {
        int idx = 0;
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;
            for (int j = idx; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}

public class 큰수만들기 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        String number = "1924";
        int k = 2;
        System.out.println(solution34.solution(number, k));
    }
}
