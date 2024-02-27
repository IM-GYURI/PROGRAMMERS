package Level0;

class Solution6 {
/*    public String solution(String my_string) {
        ArrayList<Character> list = new ArrayList<>();
        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        boolean isOK = false;

        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < aeiou.length; i++) {
                if (c != aeiou[i]) {
                    isOK = true;
                } else {
                    isOK = false;
                    break;
                }
            }
            if (isOK) {
                list.add(c);
            }
        }

        String result = "";
        for (char c: list) {
            result += c + "";
        }

        return result;
    }*/

    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}

public class 모음제거 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        String my_string = "bus";
        System.out.println(solution6.solution(my_string));

        my_string = "nice to meet you";
        System.out.println(solution6.solution(my_string));
    }
}
