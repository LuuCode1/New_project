/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class HoaDon {
    private String Ma;
    private Date NgayTao;
    private NhanVien tenNV;
    private int TinhTrang;

    public HoaDon() {
    }

    public HoaDon(String Ma, Date NgayTao, NhanVien tenNV, int TinhTrang) {
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.tenNV = tenNV;
        this.TinhTrang = TinhTrang;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public NhanVien getTenNV() {
        return tenNV;
    }

    public void setTenNV(NhanVien tenNV) {
        this.tenNV = tenNV;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    public  String getTrangThai(){    
    if(TinhTrang == 0) {
      return "Đã thanh toán";
    } else if(TinhTrang == 1) {
      return "Chờ thanh toán";
    } else {  
      return "Hủy";
    }
  }
}
