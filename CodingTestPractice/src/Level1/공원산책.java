package Level1;

// 첫번째 풀이 -> 실패 (X 구현을 안 함)
// 두번째 풀이 -> x, y 방향 반대로

class Solution40 {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;

        char[][] arr = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                x = i;
                y = park[i].indexOf("S");
            }
        }

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.valueOf(route.split(" ")[1]);

            int nx = x;
            int ny = y;

            for (int i = 0; i < distance; i++) {
                if (direction.equals("E")) {
                    ny++;
                } else if (direction.equals("W")) {
                    ny--;
                } else if (direction.equals("S")) {
                    nx++;
                } else {
                    nx--;
                }

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if (arr[nx][ny] == 'X') {
                        break;
                    }

                    if (i == distance - 1) {
                        x = nx;
                        y = ny;
                    }
                }
            }
        }

        return new int[]{x, y};
    }
}

public class 공원산책 {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(solution40.solution(park, routes));
    }
}
