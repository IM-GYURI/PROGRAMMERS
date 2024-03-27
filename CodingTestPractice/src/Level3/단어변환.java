package Level3;

class Solution1 {
    static boolean[] visited;
    static int answer;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }

    public void dfs(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            answer = count;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int diff = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != words[i].charAt(j)) {
                    diff++;
                }
            }

            if (diff == 1) {
                visited[i] = true;
                dfs(words[i], target, words, count + 1);
                visited[i] = false;
            }
        }
    }
}

public class 단어변환 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution1.solution(begin, target, words));
    }
}
