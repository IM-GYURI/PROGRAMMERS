package Level2;

import java.util.HashMap;

class Solution37 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return answer;
    }
}

public class 전화번호목록 {
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution37.solution(phone_book));
    }
}
