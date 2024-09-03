package chap01;

import java.util.Scanner;

public class SumOf {

    static int sumOf(int a, int b) {
        int min;
        int max;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값: ");
        int a = sc.nextInt();
        System.out.println("b의 값: ");
        int b = sc.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수 합은: "+ sumOf(a,b)+"입니다");
    }
}


