package Level2;

class Solution31 {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}

public class 점프와순간이동 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int N = 5;
        System.out.println(solution31.solution(N));
    }
}
