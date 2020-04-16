/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phamvuonglamnhac_59131658_bt1;

/**
 *
 * @author Administrator
 */
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return  super.HienThiTT()+"\n"+
            "Môn Dạy: " + monDay +"\n"+
            "Tổ Bộ Môn: " + toBoMon;
    }
    
}
