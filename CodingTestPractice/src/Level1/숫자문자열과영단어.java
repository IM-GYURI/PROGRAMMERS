package Level1;

class Solution1 {
    public int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));
            }
        }

        return Integer.parseInt(s);
    }
}

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        String s = new String("one4seveneight");
        Solution1 solution = new Solution1();
        System.out.println(solution.solution(s));

        s = new String("23four5six7");
        System.out.println(solution.solution(s));

        s = new String("2three45sixseven");
        System.out.println(solution.solution(s));

        s = new String("123");
        System.out.println(solution.solution(s));
    }
}
