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
        primeTesting();

        factoringTesting();
    }

    public static void primeTesting() {
        boolean primality = true;
        long avgHB = 0;
        long avgDoc = 0;
        for (int i = 100; i > 0; i--) {

            Random rand = new Random();

            int randomNum = rand.nextInt();

            Primality k = new Primality(randomNum);
            long temp = k.User_Alg_Check();
            avgHB += temp;
            //System.out.println(String.valueOf(i)+": " +String.valueOf(randomNum));
            //System.out.println("HomeBrew ~ time: " + String.valueOf(temp) + " :: Prime: " + String.valueOf(k.hbprime));

            temp = k.isPrime2();
            avgDoc += temp;

            //System.out.println("Documented ~ time: " + String.valueOf(temp) + " :: Prime: " + String.valueOf(k.prime) +"\n");
            if (k.prime != k.hbprime) {
                System.out.println("\n\n\n There is an incorrect Result! \n\n\n");
                primality = false;
            }

        }

        Primality k = new Primality(1);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(13);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(15485863);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(32452843);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(49979687);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(67867967);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(104395301);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(256203161);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(512927357);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(756065159);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        k = new Primality(982451653);
        System.out.println("Number: " + String.valueOf(k.User) + "\n\tHomeBrewed ~ time: " + String.valueOf(k.User_Alg_Check()) + " \n\tDocumented ~ time: " + String.valueOf(k.isPrime2()) + "\n");

        System.out.println("100 random numbers\nHomebrewed avg time: " + String.valueOf(avgHB / 100) + "\nDocumented avg time: " + String.valueOf(avgDoc / 100) + "\n");

    }

    private static void factoringTesting() {
        Factoring k = new Factoring(1);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(20);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(150);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(2500);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(50000);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(100003);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(3000005);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(800000007);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        k = new Factoring(250000013);
        k.primeFactors();
        k.primeFactorsTwo();
        System.out.println("Number: " + String.valueOf(k.base) + "\n\tAlgorithm One ~ time: " + String.valueOf(k.timeFactoringOne) + " \n\tAlgorithm Two ~ time: " + String.valueOf(k.timeFactoringTwo) + "\n");

        long avgOne = 0;
        long avgTwo = 0;
        for (int i = 100; i > 0; i--) {

            Random rand = new Random();

            int randomNum = rand.nextInt();

            k = new Factoring(randomNum);
            k.primeFactors();
            avgOne += k.timeFactoringOne;
            //System.out.println(String.valueOf(i)+": " +String.valueOf(randomNum));
            //System.out.println("HomeBrew ~ time: " + String.valueOf(temp) + " :: Prime: " + String.valueOf(k.hbprime));

            k.primeFactors();
            avgTwo += k.timeFactoringTwo;

            //System.out.println("Documented ~ time: " + String.valueOf(temp) + " :: Prime: " + String.valueOf(k.prime) +"\n");
        }
        
        System.out.println("100 random numbers\n\tAlgorithm One ~ avg time: " + String.valueOf(avgOne/100) + " \n\tAlgorithm Two ~ avg time: " + String.valueOf(avgTwo/100) + "\n");

    }

}
