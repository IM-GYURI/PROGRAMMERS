package Level2;

import java.util.LinkedList;
import java.util.Queue;

class Solution12 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int weightSum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int curTruckWeight = truck_weights[i];

            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(curTruckWeight);
                    weightSum += curTruckWeight;
                    time++;
                    break;
                } else if (queue.size() == bridge_length) {
                    weightSum -= queue.poll();
                } else {
                    if (weightSum + curTruckWeight > weight) {
                        queue.offer(0);
                        time++;
                    } else {
                        queue.offer(curTruckWeight);
                        weightSum += curTruckWeight;
                        time++;
                        break;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution12.solution(bridge_length, weight, truck_weights));
    }
}
