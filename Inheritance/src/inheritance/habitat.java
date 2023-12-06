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
public class habitat extends hewan{
    
    String makan;
   
    public void pemakan (String makanan)
    {
        makan=makanan;
        System.out.println ("Makanannya : " +makan);
    }
}
