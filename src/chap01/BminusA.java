package chap01;

import java.util.Scanner;

public class BminusA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a입력");
        int a = sc.nextInt();
        System.out.println("b입력");
        int b;

        do{
            System.out.println("b의 값: ");
            b = sc.nextInt();
            if(b<=a){
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        } while(b<=a);
        System.out.println("b - a는" + (b - a) + "입니다.");
    }

}
