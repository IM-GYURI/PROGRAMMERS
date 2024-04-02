package Level1;

class Solution24 {
    public String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();
        String leftSide = "147";
        String rightSide = "369";
        String center = "2580";

        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];

            if (leftSide.contains(n + "")) {
                left = n;
                sb.append("L");
            }
            if (rightSide.contains(n + "")) {
                right = n;
                sb.append("R");
            }
            if (center.contains(n + "")) {
                if (n == 0) {
                    n = 11;
                }

                int leftDistance = (Math.abs(n - left) / 3 + Math.abs(n - left) % 3);
                int rightDistance = (Math.abs(n - right) / 3 + Math.abs(n - right) % 3);

                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        right = n;
                        sb.append("R");
                    } else {
                        left = n;
                        sb.append("L");
                    }
                } else if (leftDistance > rightDistance) {
                    right = n;
                    sb.append("R");
                } else {
                    left = n;
                    sb.append("L");
                }
            }
        }

        return sb.toString();
    }
}

public class 키패드누르기 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution24.solution(numbers, hand));
    }
}
