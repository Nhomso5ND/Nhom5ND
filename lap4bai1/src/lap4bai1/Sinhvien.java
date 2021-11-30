/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4bai1;


import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class Sinhvien {

    private String Masv;
    private String Tensv;
    private Data Namsinh;
    private String Diachi;
    private String Lop;

    public Sinhvien() {
    }

    public Sinhvien(String Masv, String Tensv, Data Namsinh, String Diachi, String Lop) {
        this.Masv = Masv;
        this.Tensv = Tensv;
        this.Namsinh = Namsinh;
        this.Diachi = Diachi;
        this.Lop = Lop;
    }

    Sinhvien(String maSinhVien, String hoVaTen, int namSinh, String diachi, String lop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Sinhvien(String maSinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public Data getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(Data Namsinh) {
        this.Namsinh = Namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    

    @Override
    public String toString() {
        return "Sinhvien{" + "Masv=" + Masv + ", Tensv=" + Tensv + ", Namsinh=" + Namsinh + ", Diachi=" + Diachi + ", Lop=" + Lop + '}';
    }
	public int compareTo(Sinhvien o) {
		return this.Masv.compareTo(o.Masv);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Lop, Diachi, Tensv, Masv, Namsinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinhvien other = (Sinhvien) obj;
		return Objects.equals(Masv, other.Masv);
	}

}
