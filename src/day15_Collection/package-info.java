
package day15_Collection;

/*Khai báo lớp Công nhân (mã công nhân, Họ tên, Địa chỉ, Số ĐT, Bậc thợ)
– trong đó Bậc thợ là một số nguyên từ 1 đến 7. Mã công nhân là một số nguyên có 4 chữ số, tự động tăng.

Khai báo lớp Xưởng sản xuất (mã xưởng, tên xưởng, mô tả, Hệ số công việc),
mã xưởng là một số nguyên có 3 chữ số, tự động tăng. Hệ số công việc là một số thực trong khoảng từ 1 đến 20,
cho biết mức đánh giá chung về các công việc trong xưởng đó đảm nhiệm.

Khai báo lớp Bảng Danh sách chấm công (trong một tháng) có quan hệ kết hợp (association)
với lớp Công nhân và lớp Xưởng sản xuất, trong đó với mỗi công nhân cho biết
đang làm tại xưởng nào tương ứng và số ngày làm việc tương ứng. Một công nhân có thể thay đổi xưởng sản xuất nhiều lần
trong tháng nhưng tổng số ngày làm việc không vượt quá 30.

Viết chương trình trong ngôn ngữ JAVA thực hiện các yêu cầu sau:

        1. Nhập danh sách công nhân mới.
        2. In ra danh sách các công nhân đã có
        3. Nhập danh sách xưởng sản xuất.
        4. In ra danh sách xưởng đã có
        5. Lập Bảng danh sách chấm công cho từng công nhân
        6. in danh sách chấm công
        7. Sắp xếp danh sách Bảng danh sách phân công
        a. Theo tên công nhân
        b. Theo xưởng
        8. Lập bảng kê thu nhập cho mỗi công nhân trong tháng.
        Thu nhập = 450000 * Bậc lương * Hệ số công việc * (số ngày làm việc/22). */
