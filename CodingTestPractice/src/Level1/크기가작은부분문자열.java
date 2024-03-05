package Level1;

class Solution13 {
    public int solution(String t, String p) {
        int answer = 0;
        String[] result = new String[t.length() - p.length() + 1];
        long pNum = Long.parseLong(p);

        for (int i = 0; i < result.length; i++) {
            int startIdx = i;
            int endIdx = i + p.length();

            result[i] = t.substring(startIdx, endIdx);
        }

        for (String s : result) {
            if (Long.parseLong(s) <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String t = "3141592";
        String p = "271";
        System.out.println(solution13.solution(t, p));

        t = "500220839878";
        p = "7";
        System.out.println(solution13.solution(t, p));

        t = "10203";
        p = "15";
        System.out.println(solution13.solution(t, p));
    }
}
