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

}
