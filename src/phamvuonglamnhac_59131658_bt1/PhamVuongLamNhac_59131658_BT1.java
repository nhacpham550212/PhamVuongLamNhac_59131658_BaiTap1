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
public class PhamVuongLamNhac_59131658_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("CNTT", "hát", "Nguyễn Văn A", 20, "Ngô tất tố", "12345671");
        HocSinh hs2 = new HocSinh("CNTP", "nhảy", "Nguyễn Văn B", 21, "Phạm văn đồng", "12345672");
        GiaoVien gv1 = new GiaoVien("vẽ", "hội họa", "Lê văn thành", 28, "Bắc Sơn", "12345673");
        GiaoVien gv2 = new GiaoVien("Văn", "Văn học", "Lê Thị diệu", 28, "Bắc Sơn", "12345673");
        LopHoc lophoc = new LopHoc();
        lophoc.themGVGD(gv1);
        lophoc.themGVGD(gv2);
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        lophoc.inDSGVGD();
        lophoc.inDSHS();
    }
    
}
