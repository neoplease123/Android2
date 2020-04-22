/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Admin
 */
public class context {
    private TinhToan tinhtoan;
    public context (TinhToan tinhtoan){
        this.tinhtoan =tinhtoan;
    }
    public float Tinhtoan(float a, float b){
        return tinhtoan.Tinh(a,b);
    }
}
