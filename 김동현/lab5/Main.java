import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int ROW = 5;
    private static final int COL = 5;

    public static void main(String[] args) {
        //학번, 이름 출력
        System.out.println("202211266, 김동현");

        // [numbers 배열을 오름차순으로 정렬한 뒤에 출력해주세요]
        int[] numbers = {1, 12, -1, 22, 17, 15, 123123, 22, -121, 190, 0, -11, -150};
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length; i++) {
            System.out.print("["+numbers[i]+"]");
        }
        System.out.println();

        // [빙고게임]
        // 1. int형 2차원 배열 map을 (ROW*COL) 크기로 생성해 주세요

        int[][] map = new int[ROW][COL];

        // 건드리지 않아도 됩니다(map 세팅)
        setMap(map);

        // 2. 스캐너 sc를 생성해주세요
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("숫자를 입력해주세요[ex: 5] : ");
            sc = new Scanner(System.in);

            // 3. 사용자로부터 정수 하나를 입력받아주세요
            int num = sc.nextInt();

            // 4. map 배열에서 해당 숫자의 칸을 0으로 만들어주세요.
            for(int i=0; i<ROW; i++) {
                for(int j=0; j<COL; j++) {
                    if(map[i][j] == num)
                        map[i][j] = 0;
                }
            }

            // 5. 3빙고 이상이면 while 문을 종료해주세요.
            int sum = 0, count = 0;

            for(int i=0; i<ROW; i++) { // 가로
                for (int j=0; j<COL; j++)
                    sum += map[i][j];
                if (sum == 0)
                    count++;
                sum = 0;
            }


            for(int j=0; j<COL; j++) { // 세로
               for (int i=0; i<ROW; i++)
                    sum += map[i][j];
               if (sum == 0)
                   count++;
               sum = 0;
            }


            for(int i=0; i<ROW; i++) // 왼쪽 상단 -> 오른쪽 하단
                sum += map[i][i];
            if (sum == 0 && ROW == COL)
                count++;
            sum = 0;

            for(int i= 0; i<ROW; i++) {
                int j = 4 - i;
                sum += map[i][j];
            }
            if (sum == 0 && ROW == COL)
                count++;

            if(count >= 3)
                break;
            System.out.println();
        }

        // 6. 게임이 종료되면 map 배열을 출력해주세요
        for(int i=0; i<ROW; i++) {
            for(int j=0; j<COL; j++) {
                System.out.print("["+map[i][j]+"]");
            }
            System.out.println();
        }
    }

    private static void setMap(int[][] map) {
        for (int i=1; i<= ROW*COL; i++) {
            boolean flag = true;
            while (flag) {
                int mi = ((int) (Math.random() * 10)) % ROW;
                int mj = ((int) (Math.random() * 10)) % COL;
                if (map[mi][mj] == 0) {
                    map[mi][mj] = i;
                    flag = false;
                }
            }
        }
    }
}
