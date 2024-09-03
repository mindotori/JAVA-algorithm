package chap01;
//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수를 입력하세요: ");
        int num = sc.nextInt();

        while (true){
            if(num>0)
                break; // num이 양수면 탈출
            System.out.println("양의 정수를 입력하세요: "); // 음수면 양수 입력할 때까지 무한반복
            num = sc.nextInt(); // 양수 입력 유도
        }

        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        System.out.println("자릿수는: "+ count);
    }


}


