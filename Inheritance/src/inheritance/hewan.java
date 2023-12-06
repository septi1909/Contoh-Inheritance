/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author septi
 */
public class hewan {
    
    String warnakulit;
    int jumlahkaki;
   
    void warnakulit (String warna)
    {
        warnakulit=warna;
        System.out.println ("Warna Kulitnya : " +warnakulit);
    }
   
    void jumlahkaki (int jumlah)
    {
        jumlahkaki=jumlah;
        System.out.println ("Jumlah Kakinya : " +jumlahkaki);
    }
}

