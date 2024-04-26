package Level1;

import java.util.Arrays;

class Solution37 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    lottos[i] = -1;
                }
            }
        }

        int countCorrect = 0;
        int countZero = 0;
        for (int lotto : lottos) {
            if (lotto == -1) {
                countCorrect++;
            } else if (lotto == 0) {
                countZero++;
            }
        }

        switch(countCorrect + countZero) {
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
                break;
        }

        switch(countCorrect) {
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
                break;
        }

        return answer;
    }
}

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution37.solution(lottos, win_nums)));
    }
}
