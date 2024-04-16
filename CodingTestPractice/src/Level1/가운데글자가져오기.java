package Level1;

class Solution28 {
    public String solution(String s) {
        return (s.length() % 2 == 0) ?
                "" + s.charAt(s.length() / 2 - 1) + s.charAt(s.length() / 2)
                : "" + s.charAt(s.length() / 2);
    }
}

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        String s = "abcde";
        System.out.println(solution28.solution(s));

        s = "qwer";
        System.out.println(solution28.solution(s));
    }
}
