/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4bai2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sanpham {
    private String Ten;
    private String Gia;

    public Sanpham() {
    }

    public Sanpham(String Ten, String Gia) {
        this.Ten = Ten;
        this.Gia = Gia;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return "Sanpham{" + "Ten=" + Ten + ", Gia=" + Gia + '}';
    }
    public void nhap(){
        System.out.println("Nhap ten san pham");
        Scanner sc =new Scanner(System.in);
        Ten=sc.nextLine();
        System.out.println("Nhap don gia");
        Gia=sc.nextLine();
    }
    public void hienthi(){
        System.out.println("Ten san pham"+Ten);
        System.out.println("Don gia san pham"+Gia);
    }
}
