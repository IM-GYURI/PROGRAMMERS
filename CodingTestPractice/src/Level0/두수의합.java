package Level0;

import java.math.BigInteger;

class Solution13 {
    public String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)) + "";
    }
}

public class 두수의합 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String a = "582";
        String b = "734";
        System.out.println(solution13.solution(a, b));
    }
}
