package Level2;

class Solution49 {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];

            if (arr[i].length() == 0) {
                sb.append(" ");
            } else {
                sb.append(now.substring(0, 1).toUpperCase());
                sb.append(now.substring(1, now.length()).toLowerCase());
                sb.append(" ");
            }
        }

        if (s.substring(s.length() - 1, s.length()).equals(" ")) {
            return sb.toString();
        }

        return sb.toString().substring(0, sb.length() - 1);
    }
}

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        String s = "3people unFollowed me";
        System.out.println(solution49.solution(s));
    }
}
