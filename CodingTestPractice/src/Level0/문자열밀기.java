package Level0;

class Solution7 {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }


        String temp = "";

        for (int i = 0; i < A.length() - 1; i++) {
            String result = "";
            if (i == 0) {
                result += A.substring(A.length() - 1, A.length());
                result += A.substring(0, A.length() - 1);
            } else {
                result += temp.substring(temp.length() - 1, temp.length());
                result += temp.substring(0, temp.length() - 1);
            }
            if (result.equals(B)) {
                return i + 1;
            }
            temp = result;
        }

        return -1;
    }
}
public class 문자열밀기 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        String A = "hello";
        String B = "ohell";
        System.out.println(solution7.solution(A, B));

        A = "apple";
        B = "elppa";
        System.out.println(solution7.solution(A, B));

        A = "atat";
        B = "tata";
        System.out.println(solution7.solution(A, B));

        A = "abc";
        B = "abc";
        System.out.println(solution7.solution(A, B));
    }
}
