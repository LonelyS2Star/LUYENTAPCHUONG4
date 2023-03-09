/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LUYENTAP;

/**
 *
 * @author Ngoc Nhi
 */
public class HoaQua {
    public double giaBan;
    public String nguonGoc;
    public int ngayNhap ; 
    public double soLuong;


public HoaQua(double giaBan,String nguonGoc,int ngayNhap,double soLuong){
    this.giaBan=giaBan;
    this.nguonGoc=nguonGoc;
    this.ngayNhap=ngayNhap;
    this.soLuong=soLuong;
}

 

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

}
