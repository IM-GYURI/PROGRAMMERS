package Level1;

class Solution9 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p') {
                pNum++;
            } else if (c == 'y') {
                yNum++;
            }
        }

        if (pNum + yNum == 0) {
            return true;
        } else if (pNum == yNum) {
            return true;
        } else {
            return false;
        }
    }
}

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        String s = "pPoooyY";
        System.out.println(sol.solution(s));

        s = "Pyy";
        System.out.println(sol.solution(s));
    }
}
