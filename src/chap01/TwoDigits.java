package chap01;

import java.util.Scanner;

public class TwoDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.print("2자리의 양수를 입력하세요");

        do {
            System.out.print("no값: ");
            no = sc.nextInt();
        } while(no <10 || no > 99); //2자리니까 조건 이렇게 설정 (10보다 작거나 99보다 크면 다시 입력창 뜸)
            // !(no>=10 || no <= 99)와 같다 = 드모르간 법칙
        System.out.println("변수 no값은 "+no+"이 되었습니다.");
    }
}
