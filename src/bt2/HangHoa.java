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
public class HangHoa {
    private String tenHH;
    private int gia;
    private String mota;

    public HangHoa(){}

    public HangHoa(String tenHH, int gia, String mota) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.mota = mota;
    }
    public String gettenHH(){
        return tenHH;
    }
    public void settenHH(String tenHH){
        this.tenHH = tenHH;
    }
    public int getgia(){
        return gia;
    }
    public void setgia(int gia){
        this.gia = gia;
    }
    public String getmota(){
        return mota;
    }
    public void setmota(String mota)
    {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "tenHH=" + tenHH + ", gia=" + gia + ", mota=" + mota + '}';
    }
    
    
}
