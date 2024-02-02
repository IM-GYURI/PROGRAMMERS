package Level0;

// 와... 이 쉬운 걸... 진짜 함수 공부 좀 해야겠다
class Solution4 {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        } else {
            return 2;
        }
    }
}

public class 문자열안에문자열 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(s.solution(str1, str2));

        str1 = new String("ppprrrogrammers");
        str2 = new String("pppp");
        System.out.println(s.solution(str1, str2));

        str1 = new String("AbcAbcA");
        str2 = new String("AAA");
        System.out.println(s.solution(str1, str2));
    }
}
