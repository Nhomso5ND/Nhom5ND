/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4bai2;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class quanlysanpham {   
    private ArrayList<Sanpham>qlsp =new ArrayList<Sanpham>();
    public boolean ktTrungma(String ten){
      for(Sanpham s:qlsp){
          if(s.getTen().equalsIgnoreCase(ten))
          {
              return true;
          }
      }
      return false;
  }
    public boolean addSanPham(Sanpham s)
  {
      if(ktTrungma(s.getTen()))
          return false;
      return qlsp.add(s);
  }
    
 }
    

