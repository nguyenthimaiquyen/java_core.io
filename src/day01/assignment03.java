package day01;

//Bài 3: Tìm số lớn nhất trong 4 số biết trước.

public class assignment03 {
    public static void main(String[] args) {
        int x1 = 15;
        int x2 = -36;
        int x3 = 49;
        int x4 = -71;
        int max = findmax(x1, x2, x3, x4);
        System.out.println("Số lớn nhất trong 4 số là: " + max);
    }
    public static int findmax(int x1, int x2, int x3, int x4) {
        int max = x1;
        if (x2 > max) {
            max = x2;
        }
        if (x3 > max) {
            max = x3;
        }
        if (x4 > max) {
            max = x4;
        }
        return max;
    }
}
