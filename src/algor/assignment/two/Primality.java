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
    boolean hbprime;
    boolean prime;

    public Primality(int x) {
        User = x;
    }

    /*
     * Home Brewed Solution 
     */
    public Long User_Alg_Check() {
        long startTime = System.currentTimeMillis();

        int temp;
        if ((User % 2) == 0) {
            hbprime = false;

            long duration = 0;
            return duration;
        }
        for (int x = 3; x < User; x += 2) {
            temp = User % x;
            if (temp == 0) {
                hbprime = false;

                long endTime = System.currentTimeMillis();

                long duration = (endTime - startTime);
                return duration;
            }
        }

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);

        hbprime = true;

        return duration;
    }

    /*
    *Recorded Primality test from the internet
    */
    public Long isPrime2() {

        long startTime = System.currentTimeMillis();
        
        
        if (User == 2 || User == 1 || User == 0) {
            prime = true;
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            return duration;
        }
        if (User % 2 == 0) {
            prime = false;
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            return duration;
        }
        for (int i = 3; i <= Math.sqrt(User) + 1; i = i + 2) {
            if (User % i == 0) {
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
