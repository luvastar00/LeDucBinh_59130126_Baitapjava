/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author GIGABYTE
 */
public class XeNgoaiThanh extends ChuyenXe
{
    public String noiden;
    public int songay;
  
    
    public XeNgoaiThanh(String masochuyen, String hotentaiXe, String soxe, double doanhthu, String noiden, int songay) {
    super(masochuyen, hotentaixe, soxe, doanhthu);
    this.noiDen = noiDen;
    this.soNgay = soNgay;
    }
    
    public void xuat() {
      super.xuat();
      System.out.println("Noi den: " + this.noiden);
      System.out.println("So ngay: " + this.songay);
    }
}
