package Level1;

class Solution15 {
    public int solution(String s) {
        int answer = 0;

        while (s.length() > 0) {
            char c = s.charAt(0);
            int countX = 0;
            int countY = 0;

            for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    countX++;
                } else {
                    countY++;
                }

                if (countX == countY) {
                    answer++;
                    if (s.length() > 0) {
                        s = s.substring(countX + countY, s.length());
                    } else {
                        break;
                    }
                    break;
                }

                if (countX + countY == s.length()) {
                    answer++;
                    s = s.replace(s, "");
                    break;
                }
            }
        }

        return answer;
    }
}
public class 문자열나누기 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        String s = "banana";
        System.out.println(solution15.solution(s));

        s = "abracadabra";
        System.out.println(solution15.solution(s));

        s = "aaabbaccccabba";
        System.out.println(solution15.solution(s));
    }
}
