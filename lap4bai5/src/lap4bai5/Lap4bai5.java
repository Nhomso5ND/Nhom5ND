/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4bai5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Lap4bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soSanPham = 2;
        HashMap<String, String> hashMapProducts = new HashMap<>();
        Scanner Scanner = new Scanner(System.in);
        String maSanPham, tenSanPham;
        for (int i = 1; i <= soSanPham; i++) {
            System.out.println("Nhập thông tin của sản phẩm thứ " + i);
            System.out.println("Nhập mã sản phẩm: ");
            maSanPham = Scanner.nextLine();
            System.out.println("Nhập tên sản phẩm: ");
            tenSanPham = Scanner.nextLine();
            hashMapProducts.put(maSanPham, tenSanPham);
        }
        System.out.println("Danh sách các sản phẩm vừa nhập: ");
        System.out.println("Mã sản phẩm\tTên sản phẩm");
        Iterator <Map.Entry<String, String>> iterator
                = hashMapProducts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
        System.out.println("Nhập mã sản phẩm cần thêm: ");
        String maSanPhamMoi = Scanner.nextLine();
        if (hashMapProducts.containsKey(maSanPhamMoi)) {
            System.out.println("Mã sản phẩm = " + maSanPhamMoi + " đã tồn tại!");
        } else {
            System.out.println("Nhập tên sản phẩm cần thêm: ");
            String tenSanPhamMoi = Scanner.nextLine();
            hashMapProducts.put(maSanPhamMoi, tenSanPhamMoi);
            soSanPham++;
            System.out.println("Danh sách các sản phẩm sau khi thêm: ");
            System.out.println("Số sản phẩm = " + soSanPham);
            System.out.println("Mã sản phẩm\tTên sản phẩm");
            iterator = hashMapProducts.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                System.out.println(entry.getKey() + "\t\t" + entry.getValue());
            }

        }
    }
}
