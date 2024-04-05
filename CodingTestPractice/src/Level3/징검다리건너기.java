package Level3;

class Solution3 {
    public int solution(int[] stones, int k) {
        int answer = 0;

        int min = 0;
        int max = Integer.MAX_VALUE;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (check(mid, k, stones)) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }

        return answer;
    }

    public boolean check(int mid, int k, int[] stones) {
        int count = 0;

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] < mid) {
                count++;    // 건널 수 없는 돌의 개수 count
                if (count >= k) {   // 건널 수 없는 돌의 개수가 k보다 크면 뛰어넘을 수 없음
                    return false;
                }
            } else {
                count = 0;  // 뛰어넘었다면 다시 count 초기화
            }
        }

        return true;
    }
}

public class 징검다리건너기 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        int k = 3;
        System.out.println(solution3.solution(stones, k));
    }
}
