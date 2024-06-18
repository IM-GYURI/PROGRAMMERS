package Level2;
import java.util.*;

class Solution40 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> totalFee = new TreeMap<>();

        for (String record : records) {
            String[] temp = record.split(" ");
            int time = getTime(temp[0]);
            String car = temp[1];
            String inOut = temp[2];

            if (inOut.equals("IN")) {
                parking.put(car, time);
            } else {
                if (!totalFee.containsKey(car)) {
                    totalFee.put(car, time - parking.get(car));
                } else {
                    totalFee.put(car, totalFee.get(car) + time - parking.get(car));
                }
                parking.remove(car);
            }
        }

        if (!parking.isEmpty()) {
            for (String car : parking.keySet()) {
                Integer fee = totalFee.get(car);
                fee = (fee == null) ? 0 : fee;
                totalFee.put(car, fee + (23 * 60 + 59) - parking.get(car));
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer t : totalFee.values()) {
            int baseTime = fees[0];
            int baseFee = fees[1];
            int partTime = fees[2];
            int partFee = fees[3];

            if (t <= baseTime) {
                list.add(baseFee);
            } else {
                list.add((int) (baseFee + Math.ceil((double)(t - baseTime) / partTime) * partFee));
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int getTime(String s) {
        String[] temp = s.split(":");
        return Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
    }
}

public class 주차요금계산 {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(solution40.solution(fees, records));
    }
}
