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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> ds = new ArrayList<>();
    
    @Override
    public int them(CaNhan p) {
        ds.add(p);
        return ds.size();
    }

    @Override
    public int xoa(String ten) {
        for(CaNhan CN : ds)
        {if(CN.getHoTen().equals(ten))
        {
            ds.remove(CN);
        }
        }
        return ds.size();
    }

    @Override
    public void inDS() {
        for(CaNhan CN : ds)
        {
            CN.HienThiTT();
        }
    }
    
}
