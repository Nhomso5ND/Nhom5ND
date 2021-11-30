/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4bai1;

import java.util.Scanner;


public class TestSinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		DanhSachSinhvien dssv = new DanhSachSinhvien();
		int luaChon = 0;
		do {
	System.out.println("MENU ---------- ");
	System.out.println("Vui lòng chọn chức năng: ");
	System.out.println("1.Thêm sinh viên vào danh sách.\n"
	+ "2.	In danh sách sinh viên ra màn hình.\n"
	+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
	+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
	+ "5.	Làm rỗng danh sách sinh viên.\n"
	+ "6.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
	+ "7.	Hiển thị các sinh viên từ 1 lớp nhập từ bàn phím.\n"
	+ "8.   Thoát khỏi chương trình");
		luaChon = sc.nextInt();
		sc.nextLine();
		if(luaChon==1) {
		System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
		System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
		System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
		System.out.println("Nhập điểm dia chi: "); String diachi = sc.nextLine();
                System.out.println("Nhập lớp: "); String lop=sc.nextLine();
		Sinhvien sv = new Sinhvien(maSinhVien, hoVaTen, namSinh, diachi,lop);
		dssv.themSinhVien(sv);
				
		}else if(luaChon==2) {
		   dssv.inDanhSachSinhVien();
		}else if(luaChon==3) {
		   System.out.println("Danh sách rỗng: "+ dssv.kiemTraDanhSachRong());
		}else if(luaChon==4) {
		   System.out.println("Số lượng hiện tại: "+ dssv.laySoLuongSinhVien());
		}else if(luaChon==5) {
		   dssv.lamRongDanhSach();
		}else if(luaChon==6) {
		   System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
		   Sinhvien sv = new Sinhvien(maSinhVien);
		   System.out.println("Xóa sinh viên trong danh sách: "+dssv.xoaSinhVien(sv));
		}else if(luaChon==7) {
		System.out.println("Nhập lớp cần tìm: "); String lop = sc.nextLine();
		System.out.println("Kết quả tìm kiếm: ");
		dssv.timSinhVien(lop);		
		}
		}while(luaChon!=0);
	}
    
    

}
