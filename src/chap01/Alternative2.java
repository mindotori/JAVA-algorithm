package chap01;

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("n값: ");
        n = sc.nextInt(); // n을 사용자로부터 입력받음

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        for(int i=0; i<n/2; i++){
            System.out.print("+-");
        }
        if(n%2 != 0){
            System.out.print("+");
        }

        System.out.println(); // 출력 후 줄을 바꿔줌
    }
}
