package Level0;

class Solution9 {
    String[] words = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (babbling[i].contains(words[j])) {
                    babbling[i] = babbling[i].replace(words[j], "*");
                }
            }
        }

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].trim();
            babbling[i] = babbling[i].replace("*", "");
            if (babbling[i].length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}

public class 옹알이_1 {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(s.solution(babbling));

        babbling = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(s.solution(babbling));
    }
}
