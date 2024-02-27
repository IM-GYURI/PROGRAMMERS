package Level1;

class Solution6 {
    public int solution(int n) {
        String result = Integer.toString(n, 3); // 10진수 -> radix 진수 (여기서는 3)
        String str = "";

        for (String s : result.split("")) {
            str = s + str;
        }

        return Integer.parseInt(str, 3);    // radix 진수 (여기서는 3) str을 10진수로

/*        String str = "";

        while (n > 0) {
            str = str + (n % 3);
            n /= 3;
        }

        int num = Integer.parseInt(str);

        int answer = 0;
        int result = 0;
        int mul = 1;

        for (int i = 0; i < str.length(); i++) {
            answer = num % 10;
            result += answer * mul;
            num = num / 10;
            mul = mul * 3;
        }

        return result;*/
    }
}

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int n = 45;
        System.out.println(solution6.solution(n));

        n = 125;
        System.out.println(solution6.solution(n));
    }
}
