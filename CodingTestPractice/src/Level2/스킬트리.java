package Level2;

class Solution11 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            boolean isOk = true;
            int[] priority = new int[skill.length()];

            for (int j = 0; j < skill_trees[i].length(); j++) {
                char c = skill_trees[i].charAt(j);
                if (skill.contains(String.valueOf(c))) {
                    for (int k = 0; k < skill.length(); k++) {
                        if (skill.charAt(k) == c) {
                            for (int l = 0; l < k; l++) {
                                if (priority[l] != 1) {
                                    isOk = false;
                                }
                            }
                            priority[k] = 1;
                        }
                    }
                }
            }

            if (isOk) {
                answer++;
            }
        }

        return answer;
    }
}

public class 스킬트리 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution11.solution(skill, skill_trees));
    }
}
