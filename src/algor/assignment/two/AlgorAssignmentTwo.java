/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor.assignment.two;

import java.util.Random;

/**
 *
 * @author totalwar
 */
public class AlgorAssignmentTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean primality = true;
        
        for (int i = 100; i > 0; i--) {

            Random rand = new Random();

            int randomNum = rand.nextInt();

            Primality k = new Primality(randomNum);
            long temp = k.User_Alg_Check();

            System.out.println(String.valueOf(i)+": " +String.valueOf(randomNum));
            System.out.println("HomeBrew ~ time: " + String.valueOf(temp) + " :: Prime: " + String.valueOf(k.hbprime));
            
            temp = k.isPrime2();
            
            System.out.println("Documented ~ time: " + String.valueOf(temp) + " :: Prime: " + String.valueOf(k.prime) +"\n");
            
            if(k.prime != k.hbprime){
               System.out.println("\n\n\n There is an incorrect Result! \n\n\n"); 
               primality = false;
            }
            
            
        }
    }

}
