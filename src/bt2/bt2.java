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
public class bt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang ghonline = new GioHang();
        GioHang ghCOD = new GioHang();
        ghonline.sethinhThucTT(new ThanhToanOnline());
        ghCOD.sethinhThucTT(new ThanhToanCOD());
        HangHoa hh1 = new HangHoa("Thịt",100000,"Thịt Gà ");
        HangHoa hh2 = new HangHoa("Cá",1500000,"Cá Hồi");
        HangHoa hh3 = new HangHoa("Gạo",40000,"Gạo Ngon");
        ghonline.AddHangHoa(hh2);
        ghCOD.AddHangHoa(hh1);
        ghCOD.AddHangHoa(hh3);
        
        System.out.println("\nHiển Thị Thông Tin Sản Phẩm đặt online\n");
        ghonline.hienThi();
        System.out.println("\nTổng Số Tiền khách phải trả là: "+(ghonline.ThanhToan()));
        System.out.println("\nHiển Thị Thông Tin Sản Phẩm đặt COD\n");
        ghCOD.hienThi();
        System.out.println("\nTổng Số Tiền khách phải trả là: "+(ghCOD.ThanhToan()));
    }
    
}
