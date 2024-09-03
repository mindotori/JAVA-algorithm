package chap01;

import java.util.Scanner;

public class PlusOfGaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 n까지의 합을 구합니다.");
        int n = sc.nextInt();

        int sum = (n+1)*(n/2)+(n % 2 == 1 ? (n+1)/2 : 0);

        System.out.print("1부터 "+ n + "까지의 "+ "합은: " + sum);
    }


}
