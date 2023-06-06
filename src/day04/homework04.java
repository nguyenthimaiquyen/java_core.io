/*Bài 4:Viết chương trình Java để tính giá trị trung bình của các phần tử mảng.
        numbers = new int[]{20, 30, 25, 35, -16, 60, -100}*/
package day04;
public class homework04 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int n = numbers.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("average: " + average);
    }
}
