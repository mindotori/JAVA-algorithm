package chap01;

public class Max3Method {
    //a,b,c 중 최댓값 구해서 반환

    static int max3(int a,int b,int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(5,4,3) = " + max3(5,4,3));
    }

}
