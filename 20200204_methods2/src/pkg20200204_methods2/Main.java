/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200204_methods2;

import java.util.Scanner;

/**
 *
 * @author Lina
 */
public class Main {

    public static void test() {
        System.out.println("test");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test();
        System.out.println(add(3, 4));
        System.out.println(add(7, 9));        

        System.out.println(fakt(3));

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {},
            {9, 0, 4}
        };
        print(m);

    }

    public static int add(int a, int b) {
        return a + b;

    }
    //reik paskaiciuoti faktoriala, parasysim tam metoda:

    public static int fakt(int a) {
        if (a < 0) {
            return -1;
        } //tai matematiskai yra klaida
        if (a == 0) {
            return 1;
        }
        return a * fakt(a - 1);
    }

    //HOME WORK No1:>> rekursine funkcija Fibonaciu skaiciams;
    //turi spausdinti fibonacci skaicius;
    //metodas turi sustoti kai suma virsija lastNo
    public static void fibonacci(int firstNo, int nextNo, int lastNo) {
        int temp
                = firstNo + nextNo;
        if (temp == lastNo) {
            return;
        }

    }

    //HOME WORK No2:>> matricos determinanto skaiciavimas; matrica turi buti kvadratine; 
    // the determinant is a scalar value that can be computed from the elements
    //of a square matrix and encodes certain properties of the linear transformation described by the matrix
    /*
    + - + -
    1 2   3 4
    5 6   7   8
    9 10  11 12
    13 14 15 16
     */

 /*

1*det|6   7  8|  -2*det |5  7  8 |    +3*det |5 6 7 |       -4*det|5 6 7|
     |10 11 12|         |9 11 12|            |9 10 12|            |9 10 11|
     |14 15 16|         |13 15 16|           |13 14 15|           |13 14 15|
     
     */
    //HOME WORK No3:>> MATRICU DAUGYBA; nebutinai kvadraatines bet vienos plotis turi buti lygus kitos auksciui;
    //be rekursijo o su ciklais 
    //METODAS spausdinantis bet koki kvadratini masyva:
    public static void print(int[][] m) {
        System.out.println("...............");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("...............");
    }
    //programa turi paklausti:kiek kartu >> sakai tarkim 5 (tai bus 5 poros); 
    // i11: 1; i12: 4;  i21: 4; i22:5; i31: 4; i32:8; >>> ir t.t. 
    //ATsakymas: visos poros is eiles suma; sandauga; suma; sandauga; ir t.t. ir tada sudeti viska;

    
    /*
    /// dar vienas uzdavinys: 
    Math.random(); nuo 0 iki 10km;
    char[mp] = {'A', 'B', 'C', ... 'F'} >> cia masinos
    double[] = {0.0, 0.0, 0.0, ...}
    jei bent viena masina nuvaziavo 150km; turi buti stop; 
    po kiekvieno zingsnio isspausdinti kiek nuvaziavo;
    ir gale pasakyti kuri laimejo!
     */

}
