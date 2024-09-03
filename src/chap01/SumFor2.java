package chap01;

import java.util.Scanner;

//양수만 입력하여 1,2,...,n의 합을 구함
public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("1부터 n까지의 합을 구합니다.");

        do{
            System.out.print(" n값: ");
            n = sc.nextInt();
        } while (n<=0); //n이 0보다 클 때까지 반복 (n이 0보다 커야 종료)

        int sum = 0;

        for(int i=0; i<=n;i++){
            sum += i;
        }

        System.out.println("1부터 "+ n + "까지의 합은 "+sum+"입니다.");
    }
}
