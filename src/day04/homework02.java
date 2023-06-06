/*Bài 2:  Viết chương trình Java để tìm các phần tử trong mảng 1 xuất hiện tại mảng thứ 2
        (giá trị chuỗi) in các phần tử đó ra
        String[] array1 = {“Python”, “JAVA”, “PHP”, “C#”, “C++”, “SQL”};
        String[] array2 = {“MySQL”, “SQL”, “SQLite”, “Oracle”, “PostgreSQL”, “DB2”, “JAVA”};*/
package day04;
public class homework02 {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        System.out.println("Các phần tử trong mảng 1 xuất hiện tại mảng 2: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
