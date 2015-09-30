/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor.assignment.two;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author totalwar
 */
public class Factoring {

    long base;
    long timePrimeHB;

    public Factoring(long b) {
        base = b;
    }

    public List<Long> primeFactors() {
        long startTime = System.currentTimeMillis();
        List<Long> factors = new ArrayList<>();
        long n;
        n = this.base;
        while (n % 2 == 0 && n > 0) {
            factors.add(2L);
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }

        long endTime = System.currentTimeMillis();

        timePrimeHB = (endTime - startTime);
        return factors;
    }
}
