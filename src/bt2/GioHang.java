/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;
/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class GioHang{
 
    IThanhToan hinhThucTT;
    public void sethinhThucTT (IThanhToan hinhThucTT){
        this.hinhThucTT = hinhThucTT;
    }
    ArrayList<HangHoa> dshh = new ArrayList<>();
    public void AddHangHoa(HangHoa hh){
        dshh.add(hh);
    }
    public int TinhTienHang(){
        int tien = 0;
        for (int i =0 ; i <=dshh.size();i++)
        {
            tien = tien + dshh.get(i).getgia();
        }
        return tien;
    }
    public double ThanhToan()
    {
        return hinhThucTT.thanhToan(TinhTienHang());
    }
    public void hienThi(){
        for (int i = 0 ; i<dshh.size();i++)
        {
            System.out.println("Hàng Hóa Thứ "+ (i+1) + ":" );
            dshh.get(i).toString();
        }
    }
}
