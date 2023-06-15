/*
Khai báo lớp Người có các thuộc tính Họ tên, Địa chỉ, SĐT.
Khai báo lớp Bạn đọc kế thừa lớp Người (mã bạn đọc, loại bạn đọc),
    mã bạn đọc là một số nguyên có 5 chữ số, tự động tăng.
    Loại bạn đọc có thể là sinh viên, học viên cao học hoặc giáo viên.

Khai báo lớp Sách gồm các thuộc tính (mã sách, Tên sách, Tác giả, Chuyên ngành, Năm xuất bản)
– trong đó Chuyên ngành có thể là: Khoa học tự nhiên, Văn học – Nghệ thuật, Điện tử Viễn thông, Công nghệ thông tin.
Mã sách là một số nguyên có 5 chữ số, tự động tăng.

Khai báo lớp QL Mượn sách có quan hệ kết hợp với lớp Bạn đọc và lớp Sách
(một bạn đọc có thể mượn nhiều đầu sách khác nhau, mỗi đầu sách có thể mượn một số lượng nhất định).
Trong đó một bạn đọc sẽ được phép mượn không quá 5 đầu sách khác nhau, mỗi đầu sách không mượn quá 3 cuốn.
Ghi rõ tình trạng hiện thời của sách khi cho mượn.

Viết chương trình trong ngôn ngữ JAVA thực hiện các yêu cầu sau:

Nhập danh sách đầu sách mới. In ra danh sách các đầu sách đã có.
Nhập danh sách bạn đọc mới. In ra danh sách bạn đọc đã có.
Lập bảng QL mượn sách cho từng bạn đọc bằng cách nhập các đầu sách mà bạn đọc mượn, và in danh sách ra màn hình
(chú ý: cùng một loại bạn đọc với một đầu sách thì không thể xuất hiện 2 lần trong bảng này).
Sắp xếp danh sách Quản lý mượn sách: Theo tên bạn đọc, Theo Số lượng cuốn sách được mượn (giảm dần)
Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc.*/
