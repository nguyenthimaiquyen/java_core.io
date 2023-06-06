/*Bài 3: Chèn thêm vào (không phải là thay thế) 1 phần tử có value = 5 vào vị trí trí thứ 3 của mảng sau
        my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}*/
package day04;
public class homework03 {
    public static void main(String[] args) {
        int[] array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int n = array1.length;
        int[] array2 = new int[n + 1];
        for (int i = 0; i < array2.length; i++) {
            if (i < 3) {
                array2[i] = array1[i];
            } else if (i == 3) {
                array2[3] = 5;
            } else if (i > 3) {
                array2[i] = array1[i-1];
            }
        }
        System.out.println("Mảng sau khi chèn: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
