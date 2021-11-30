/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4bai1;

import java.util.ArrayList;
import java.util.Collections;


public class DanhSachSinhvien {

    private ArrayList<Sinhvien> danhSach;
		
	public DanhSachSinhvien() {
		this.danhSach = new ArrayList<Sinhvien>();
		}
	public DanhSachSinhvien(ArrayList<Sinhvien> danhSach) {
		this.danhSach = danhSach;
		}
	public void themSinhVien(Sinhvien sv) {
			this.danhSach.add(sv);
		}
	public void inDanhSachSinhVien() {
	  for (Sinhvien sinhVien : danhSach) {
		System.out.println(sinhVien);
		 }
		}
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
		}
	public int laySoLuongSinhVien() {
			return this.danhSach.size();
		}
	public void lamRongDanhSach() {
			this.danhSach.removeAll(danhSach);
		}
	public boolean xoaSinhVien(Sinhvien sv) {
			return this.danhSach.remove(sv);
		}
	public void timSinhVien(String lct) {
		for (Sinhvien sinhVien : danhSach) {
		if(sinhVien.getLop().indexOf(lct)>=0) {
			System.out.println(sinhVien);
				}
			}
		}
}
