package Level1;

class Solution27 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];

        // 일단 전부 체육복 O
        for (int i = 0; i < students.length; i++) {
            students[i] = 1;
        }

        // 체육복 X
        for (int i = 0; i < lost.length; i++) {
            int num = lost[i] - 1;
            students[num] -= 1;
        }

        // 체육복 2개
        for (int i = 0; i < reserve.length; i++) {
            int num = reserve[i] - 1;
            students[num] += 1;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0 && i != 0 && i != students.length - 1) {
                if (students[i - 1] == 2) {
                    students[i - 1] = 1;
                    students[i] = 1;
                } else if (students[i + 1] == 2) {
                    students[i + 1] = 1;
                    students[i] = 1;
                }
            } else if (students[i] == 0 && i == 0) {
                if (students[i + 1] == 2) {
                    students[i + 1] = 1;
                    students[i] = 1;
                }
            } else if (students[i] == 0 && i == students.length - 1) {
                if (students[i - 1] == 2) {
                    students[i - 1] = 1;
                    students[i] = 1;
                }
            }
        }

        for (int num : students) {
            if (num >= 1) {
                answer++;
            }
        }

        return answer;
    }
}

public class 체육복 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution27.solution(n, lost, reserve));
    }
}
