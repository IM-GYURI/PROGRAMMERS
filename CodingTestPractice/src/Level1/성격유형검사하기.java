package Level1;

class Solution43 {
    public String solution(String[] survey, int[] choices) {
        StringBuffer sb = new StringBuffer();
        int[][] arr = new int[4][2];

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];

            if (s.contains("R")) {
                if (s.startsWith("R")) {
                    if (choice <= 3) {
                        arr[0][0] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[0][1] += choice - 4;
                    } else {
                        continue;
                    }
                } else {
                    if (choice <= 3) {
                        arr[0][1] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[0][0] += choice - 4;
                    } else {
                        continue;
                    }
                }
            } else if (s.contains("C")) {
                if (s.startsWith("C")) {
                    if (choice <= 3) {
                        arr[1][0] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[1][1] += choice - 4;
                    } else {
                        continue;
                    }
                } else {
                    if (choice <= 3) {
                        arr[1][1] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[1][0] += choice - 4;
                    } else {
                        continue;
                    }
                }
            } else if (s.contains("J")) {
                if (s.startsWith("J")) {
                    if (choice <= 3) {
                        arr[2][0] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[2][1] += choice - 4;
                    } else {
                        continue;
                    }
                } else {
                    if (choice <= 3) {
                        arr[2][1] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[2][0] += choice - 4;
                    } else {
                        continue;
                    }
                }
            } else {
                if (s.startsWith("A")) {
                    if (choice <= 3) {
                        arr[3][0] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[3][1] += choice - 4;
                    } else {
                        continue;
                    }
                } else {
                    if (choice <= 3) {
                        arr[3][1] += 3 - choice + 1;
                    } else if (choice >= 5) {
                        arr[3][0] += choice - 4;
                    } else {
                        continue;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append((arr[i][0] >= arr[i][1]) ? "R" : "T");
            } else if (i == 1) {
                sb.append((arr[i][0] >= arr[i][1]) ? "C" : "F");
            } else if (i == 2) {
                sb.append((arr[i][0] >= arr[i][1]) ? "J" : "M");
            } else {
                sb.append((arr[i][0] >= arr[i][1]) ? "A" : "N");
            }
        }

        return sb.toString();
    }
}

public class 성격유형검사하기 {
    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution43.solution(survey, choices));
    }
}
