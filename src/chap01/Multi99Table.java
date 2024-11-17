package chap01;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("----------구구단 곱셈표----------");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // printf로 형식 지정하여 출력
                System.out.printf("%3d", i * j);
            }
            // 한 줄 출력 후 줄바꿈
            System.out.println();
        }
    }
}
