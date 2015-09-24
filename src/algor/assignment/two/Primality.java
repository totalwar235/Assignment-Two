/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor.assignment.two;

/**
 *
 * @author totalwar
 */
public class Primality {

    int User;
    boolean prime;

    public Primality(int x) {
        User = x;
    }

    public Long User_Alg_Check() {
        long startTime = System.currentTimeMillis();

        int temp;
        for (int x = 2; x < User; x++) {
            temp = User % x;
            if (temp == 0) {
                prime = false;

                long endTime = System.currentTimeMillis();

                long duration = (endTime - startTime);  
                return duration;
            }
        }

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime); 
        
        prime = true;

        return duration;
    }

}
