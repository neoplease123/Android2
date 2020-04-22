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
public class bt1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context Context = new context(new Cong());
        System.out.println(" 75+12 "+ Context.Tinhtoan(75, 12));
       
        Context = new context(new Tru());
        System.out.println(" 54-78 "+ Context.Tinhtoan(54, 78));
    }
}
