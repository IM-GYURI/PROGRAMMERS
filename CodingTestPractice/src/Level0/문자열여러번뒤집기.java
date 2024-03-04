package Level0;

class Solution10 {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;


        for (int i = 0; i < queries.length; i++) {
            int startIdx = queries[i][0];
            int endIdx = queries[i][1] + 1;
            String result = "";
            String target = reverse(answer.substring(startIdx, endIdx));


            if (startIdx != 0) {
                result += answer.substring(0, startIdx);
                result += target;
                result += answer.substring(endIdx);
            } else {
                result += target;
                result += answer.substring(endIdx);
            }
            answer = result;
        }

        return answer;
    }

    public String reverse(String target) {
        String result = "";

        for (int i = target.length() - 1; i >= 0; i--) {
                result += target.charAt(i);
        }

        return result;
    }
}

public class 문자열여러번뒤집기 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution10.solution(my_string, queries));
    }
}
