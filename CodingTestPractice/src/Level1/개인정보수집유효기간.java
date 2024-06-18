package Level1;

import java.util.*;

class Solution42 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for (String term : terms) {
            String[] termSplit = term.split(" ");
            map.put(termSplit[0], termSplit[1]);
        }

        int num = 1;
        Integer todayTotalDate = getTotalDate(today, 0);

        for (String p : privacies) {
            String[] privateSplit = p.split(" ");
            String privateDate = privateSplit[0];
            String privateTerm = privateSplit[1];
            Integer termsMonth = Integer.valueOf(map.get(privateTerm));

            Integer privateTotalDate = getTotalDate(privateDate, termsMonth) - 1;

            if (privateTotalDate < todayTotalDate) {
                result.add(num);
            }

            num++;
        }

        return result.stream().mapToInt(n -> n).toArray();
    }

    public Integer getTotalDate(String strDate, Integer termsMonth) {
        String[] dateSplit = strDate.split("\\.");
        Integer year = Integer.valueOf(dateSplit[0]);
        Integer month = Integer.valueOf(dateSplit[1]) + termsMonth;
        Integer day = Integer.valueOf(dateSplit[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(solution42.solution(today, terms, privacies));
    }
}
