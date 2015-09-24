/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor.assignment.two;

import static javafx.beans.binding.Bindings.convert;

/**
 *
 * @author totalwar
 */
public class AlgorAssignmentTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Primality k = new Primality(15485863);
        long temp = k.User_Alg_Check();
        
        System.out.println("time: "+String.valueOf(temp) + " :: Prime: " + String.valueOf(k.prime));
    }
    
}
