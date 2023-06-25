/*
Yêu cầu:
        Sử dụng 4 tính chất của OOP để giải quyết bài toán, kết hợp với mảng một chiều.
        Để đáp ứng đủ 4 tính chất OOP, học viên có thể tự tạo các class phụ trợ khác
        ngoài các class yêu cầu trong bài toán.
        - Yêu cầu xử lý tất cả các ngoại lệ có thể xảy ra trong bài toán.

        Khai báo lớp Khách hàng (mã KH, Họ tên, Địa chỉ, Số ĐT, Loại KH)
        – với Loại khách hàng có thể là: cá nhân, đại diện đơn vị hành chính,
        đại diện đơn vị kinh doanh, mã KH là một số nguyên có 5 chữ số, tự động tăng.

        Khai báo lớp Dịch vụ (mã DV, tên DV, giá cước, đơn vị tính) mã DV là một số nguyên có 3 chữ số, tự động tăng.

        Khai báo lớp Hóa đơn có quan hệ kết hợp (association) với lớp Khách hàng và lớp Dịch vụ
        trong đó một khách hàng có thể sử dụng một hoặc nhiều dịch vụ.
        Giả sử mỗi khách hàng chỉ được phép sử dụng không quá 5 loại dịch vụ khác nhau.

        Viết chương trình trong ngôn ngữ JAVA thực hiện các yêu cầu sau:

        1. Nhập danh sách khách hàng.
        2. In ra danh sách khách hàng đã có
        3. Nhập danh sách dịch vụ.
        4. In ra danh sách dịch vụ đã có
        5. Nhập hóa đơn cho mỗi khách hàng đã có, trong đó mỗi khách hàng ứng với một dịch vụ sử dụng sẽ có số
        lượng sử dụng (theo đơn vị tính) và
        6. in danh sách ra màn hình. (Chú ý: cùng một khách hàng với một loại dịch
        vụ thì không được xuất hiện quá một lần trong bảng này)
        7. Sắp xếp danh sách hóa đơn
        a. Theo Họ tên khách hàng
        b. Theo Số lượng sử dụng (giảm dần)
        8. Lập bảng kê số tiền phải trả cho mỗi khách hàng*/
