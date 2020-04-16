/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phamvuonglamnhac_59131658_bt1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class LopHoc {
    ArrayList<HocSinh>  dshocsinh  = new ArrayList<>();
    ArrayList<GiaoVien> dsgiaovien = new ArrayList<>();
    
    public int themHocSinh(HocSinh hs)
    {
        dshocsinh.add(hs);
        return dshocsinh.size();
    }
    public int themGVGD(GiaoVien gv)
    {
        dsgiaovien.add(gv);
        return dsgiaovien.size();
    }
    public void inDSHS(){
        System.out.println("Danh Sách học sinh:" +"\n");
        for(HocSinh HS : dshocsinh)
       {
          System.out.println(HS.HienThiTT()+"\n");
       }
        
    }
        public void inDSGVGD(){
        System.out.println("Danh Sách Giáo viên giảng dạy:" +"\n");
        for(GiaoVien GV : dsgiaovien)
       {
           System.out.println(GV.HienThiTT()+"\n");
       }
        
       }
    
    
}
