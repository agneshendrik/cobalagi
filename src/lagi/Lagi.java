/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagi;

/**
 *
 * @author Agnes
 */
public class Lagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3600;
        double j = 60;
        double k = 2400;
        
        System.out.println("3600 detik= " + (i / j ) + " menit:" + (i / i) + " jam");
        System.out.println("2400 detik= " + (k / j) + " menit:" + (k / i) + " jam");
    }
    
}
