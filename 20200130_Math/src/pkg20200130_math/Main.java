/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200130_math;

import java.util.Scanner;

/**
 *
 * @author Lina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ////SPRENDIMASS ANT LENTOS
        System.out.println("__________");
        System.out.println("SPRENDIMASS ANT LENTOS");
        long aa = 2;
        long bb = 3;
        float f = (float) aa / bb;
        System.out.println(f);
        System.out.println("__________");
        System.out.println("CIKLAS FOR");

        for (int i = 1; i < 10; i++) {
            /*
                cia yra keturi zingsniai; 
                1)pirmas i=1; bus ivygditas bet kuriuo atveju;
                2)antras i<10; tai yra boolean;
                3)trecias yra ciklo kunas (tai kas yra cikle;
                4)ketvirtas i++;
            
            taigi paskutineje iteracijoje dar visas kunas ivygdomas ir tik tada atlikus i++,
            atejus i antra zingsni gauni false ir sustoja, t.y ciklas baigiasi antrame zingsnyje; 
                
             */

        }
        for (int i = 1, j = 7; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }
        for (int i = 1, j = 7; i < j;) {
            System.out.println(i++);
            System.out.println(j--);
        }
        int i = 1;
        int j = 10;
        for (;;) {
            System.out.println(i++);
            System.out.println(j--);
            if (i == 3) {
                break;
            }
        }
        System.out.println(j--); //spausdina eilute, sekantis sout eis is naujos;
        System.out.print(j--); //spausdins viska vienoje eiluteje;
        System.out.println("......");
        System.out.println("ATSPAUSDINTI LENTELE ");

        int num2 = 1;
        int num1 = 1;
        int sun = 1;
        for (int b = 1; b <= 5; b++) {
            for (int a = 1; a <= 5; a++) {
                sun = num1 * num2;
                System.out.print(sun + " ");
                num2++;
            }
            System.out.println(" ");
            num1++;
            num2 = 1;
        }
        ////////////////////////////
        System.out.println("......");
        System.out.println("ATSPAUSDINTI LENTELE ");
        for (int c = 1; c <= 5; c++) {
            for (int d = 1; d <= 5; d++) {
                System.out.print(c * d);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        //////////////////////
        System.out.println("MASYVAI");
        int[] m = new int[5];
        System.out.println(m.length);
        m[0] = 1;
        m[1] = 13;
        m[3] = 102;
        m[4] = -2;

        System.out.println(m); //taip nespausdina nariu;
        //jei norime isprintinti visus elementus darom ciklus:
        for (int e = 0; e < m.length; e++) {
            System.out.print(m[e] + " ");
        }
        /*
        System.out.println("");         
        m = new int[4];
         */
// cia pakeiciame kintamojo m reiksme, 
        //kintamasis m gali rodyti i bet kokio ilgio areju taigi tokiu budu gli pailginti areju: 
        //susikuri nauja areju (visos reiksmes bus lygios 0) ir per cikla nukopijuoji visas reiksmes i ji;
        for (int e = 0; e < m.length; e++) {
            System.out.print(m[e] + " ");
        }
        System.out.println("");
        System.out.println("AREJAUS ILGINIMAS");
        int n[] = new int[m.length + 1];
        for (i = 0; i < m.length; i++) {
            n[i] = m[i];
        }
        m = n; //cia pasakom kad m dabar yra vienu ilgesnis su visomis n reiksmemis;
        for (int e = 0; e < m.length; e++) {
            System.out.print(m[e] + " ");
        }
        System.out.println("");
        int[] z = {1, 0, 13, 0, -2};
        for (int e = 0; e < z.length; e++) {
            System.out.print(z[e] + " ");
            System.out.println("");
        }

        //MASYVAI atseit multidimenciniai; t.y .
        System.out.println("MASYVAI MASYVUOSE");
        int[][] kv = new int[2][3];
        int[][] ku = {
            {1, 2, 3, 4},
            {11, 12, 13, 14, 15},
            {21, 22, 23},
            {31, 32, 33, 34, 35, 36}
        };
        //
        for (i = 0; i < ku.length; i++) {
            for (j = 0; j < ku[i].length; j++) {
                System.out.print(ku[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("..............");
        System.out.println("HOME WORK");
        //homeWORK 2
        //surusiuoti didejimo tvarka:
//        int[] arr2 = {4, 17, 2, -4, 22, 101};
//        System.out.println("HOME WORK");
        //homeWORK 3 surusiuoti masyva ku mazejimo tvarka (nekeiciant strukturos);
        //atprintinti lentele is masyvo 
//        int[] arr = {1, 2, 3, 4, 5, 6};
        //kurioje paskutinis 
        //skaicius pereina i antra eilute viska ir taip kol persuka ;
        /*
        123456
        612345
        561234
        456123
        345612
        234561        
         */
        System.out.println("..........");
        System.out.println("Nr1:");
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrTemp = new int[arr.length];

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
                if (j == 0) {
                    arrTemp[j] = arr[arr.length - 1];

                } else {
                    arrTemp[j] = arr[j - 1];
                }
            }
            System.out.println("");
            arr = arrTemp;
            arrTemp = new int[arr.length]; //KODEL!!! KAS CIA VYKSTA????
//      
        }
        System.out.println("..........");
        System.out.println("Nr2:");
        int[] arr2 = {4, 17, 2, -4, 22, 101};
        int temp = 0;
//        int[] arrTemp2 = new int[arr2.length];
//        for (i = 0; i < arr2.length ; i++) {
//            for (j = 0; j < arr2.length ; j++) {
//                if (arr2[i] < arr2[j]) {
//                    temp = arr2[j];
//                    arr2[j] = arr2[i];
//                    arr2[i] = temp;
//                }
//            }
//        }
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("...........");
//        arr2 = new int[]{4, 17, 2, -4, 22, 101};
        int[] arr3 = {4, 17, 2, -4, 22, 101};
        temp = 0;
//        int[] arrTemp2 = new int[arr2.length];
        for (i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                temp = arr3[i + 1];
                arr3[i + 1] = arr3[i];
                arr3[i] = temp;
                i = -1;
            }
        }
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("..............");
        System.out.println("Nr3:");
        int[][] sToB = {
            {1, 2, 3, 4},
            {11, 12, 13, 14, 15},
            {21, 22, 23},
            {31, 32, 33, 34, 35, 36}
        };
        System.out.println("..............");
        //printinu dvimati areju:        
        for (i = 0; i < sToB.length; i++) {
            for (j = 0; j < sToB[i].length; j++) {
                System.out.print(sToB[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        //sukeiciu arejus(eilutes nuo didziausios iki maziausios:   
        arrTemp = new int[sToB.length];
        for (i = 0; i < sToB.length - 1; i++) {
            j = 0;
            if (sToB[i][j] < sToB[i + 1][j]) {
                arrTemp = sToB[i + 1];
                sToB[i + 1] = sToB[i];
                sToB[i] = arrTemp;
                i = -1;
            }
        }
        System.out.println("............");
        for (i = 0; i < sToB.length; i++) {
            for (j = 0; j < sToB[i].length; j++) {
                System.out.print(sToB[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
//sukeiciu areju eilutese nuo didziausio iki maziausio;
        temp = 0;
        for (i = 0; i < sToB.length - 1; i++) {
            for (j = 0; j < sToB[i].length - 1; j++) {
                if (sToB[i][j] < sToB[i][j + 1]) {
                    temp = sToB[i][j + 1];
                    sToB[i][j + 1] = sToB[i][j];
                    sToB[i][j] = temp;
                    j = -1;
                }
            }
        }
        System.out.println("..............");
        //printinu dvimati areju:        
        for (i = 0; i < sToB.length; i++) {
            for (j = 0; j < sToB[i].length; j++) {
                System.out.print(sToB[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
