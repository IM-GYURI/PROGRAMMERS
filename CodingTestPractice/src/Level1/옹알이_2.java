package Level1;

class Solution14 {
    static final String[] words = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (babbling[i].contains(words[j])) {
                    switch (j) {
                        case 0 :
                            babbling[i] = babbling[i].replace(words[j], "0");
                            break;
                        case 1 :
                            babbling[i] = babbling[i].replace(words[j], "1");
                            break;
                        case 2 :
                            babbling[i] = babbling[i].replace(words[j], "2");
                            break;
                        case 3 :
                            babbling[i] = babbling[i].replace(words[j], "3");
                            break;
                    }
                }
            }
        }

        for (int i = 0; i < babbling.length; i++) {
            int count = 0;
            boolean flag = true;
            for (int j = 0; j < babbling[i].length(); j++) {
                if (babbling[i].charAt(j) >= '0' && babbling[i].charAt(j) <= '3') {
                    count++;
                }
            }

            if (count == babbling[i].length()) {
                char pre = 'a';
                char cur = 'b';
                for (int j = 0; j < babbling[i].length(); j++) {
                    cur = babbling[i].charAt(j);
                    if (pre ==  cur) {
                        flag = false;
                    }
                    pre = cur;
                }

                if (flag) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class 옹알이_2 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        String[] babbling = {"aya", "yee", "u", "maa"};
//        System.out.println(solution14.solution(babbling));

        babbling = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution14.solution(babbling));
    }
}
