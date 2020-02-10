/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200205_homework_recursion_scannergame_cars;

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

        System.out.println("SCANNER GAME: (a*b)+(a+b+c)+(a*b)...");
        // scannerGame();
        System.out.println("");
        System.out.println("......................");

        System.out.println("FIBONACCI RECURSION");
        fibonacciRec(1, 2, 20);
        System.out.println("");
        System.out.println("......................");

        System.out.println("DETERMINANT");
        int[][] squaredArr4 = {
            {5, 2, 3, 4},
            {1, 5, 3, 7},
            {1, 2, 3, 4},
            {5, 2, 5, 4}
        };

        int[][] squaredArr5 = {
            {5, 2, 3, 4, 90},
            {1, 87, 5, 3, 7},
            {1, 2, 3, 45, 4},
            {5, 22, 9, 5, 4},
            {1, 22, 9, 5, 4}
        };

        int[][] squaredArr2 = {
            {5, 2},
            {3, -17}
        };

        int[][] squaredArr3 = {
            {5, 2, 4},
            {1, 3, 7},
            {1, 2, 3}
        };

//        determinant(squaredArr3);
        System.out.println("Determinant of given matrix is: " + determinant(squaredArr4));

        System.out.println("");
        System.out.println("......................");

        System.out.println("CARS");
        double[] dist = {0, 0, 0, 0, 0, 0, 0};
        char[] cars = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        cars(cars, dist, 150);

        System.out.println("");
        System.out.println("......................");
    }

    public static void scannerGame() {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pairs do you want to have?");
        int pairs = sc.nextInt();

        while (pairs <= 0) {
            System.out.println("Number of pairs has to be more than zero!");
            System.out.println("How many pairs do you want to have?");
            pairs = sc.nextInt();
        }

        int[] arr = new int[pairs + 1];
        int[][] arrAllNum = new int[pairs + 1][2];

        while (i <= pairs) {
            System.out.println("Enter a first number of pair (pairNo1):");
            int pairNo1 = sc.nextInt();
            arrAllNum[i][0] = pairNo1;

            System.out.println("Enter a second number of pair (pairNo2):");
            int pairNo2 = sc.nextInt();
            while (pairNo2 <= pairNo1) {
                System.out.println("pairNo2 has to be more then pairNo1!");
                System.out.println("Enter a second number of pair (pairNo2):");
                pairNo2 = sc.nextInt();
            }
            arrAllNum[i][1] = pairNo2;

            if (i % 2 == 0) {
                int temp = pairNo1;
                while (pairNo1 < pairNo2) {
                    temp = temp + (pairNo1 + 1);
                    pairNo1 = (pairNo1 + 1);
                }
                arr[i] = temp;
            }
            if (i % 2 != 0) {
                int temp = pairNo1;
                while (pairNo1 < pairNo2) {
                    temp = temp * (pairNo1 + 1);
                    pairNo1 = (pairNo1 + 1);
                }
                arr[i] = temp;
            }
            i++;
        }
        int sum = 0;
        for (int a = 1; a < pairs + 1; a++) {
            sum += arr[a];
            if (a % 2 != 0) {
                System.out.print("Pair " + a + " is: " + arrAllNum[a][0] + " and " + arrAllNum[a][1] + "; ");
            } else {
                System.out.print("Pair " + a + " is: " + arrAllNum[a][0] + " and " + arrAllNum[a][1] + "; ");
            }
        }

        System.out.println("Final product is: " + sum + ".");
        System.out.println("......................");
    }

    public static void fibonacciRec(int a, int b, int c) {
        if (a < 0 || b < a || b == 0) {
            System.out.println("First Fibonacci number must be equel to or more than zero;");
            System.out.println("Second Fibonacci number can not be zero and must be equel or more than first number!");
        } else {
            //kai abu maziau >> spausdinam abu ir abu padidinam iki sekanciu dvieju;
            if (b <= c) {
                System.out.print(a + " " + b + " ");
                a = a + b;
                b = b + a;
                //padidinus, jei a (pirmas narys) vis dar maziau nei galutinis (c) kvieciam rekursija;
                if (a <= c) {
                    fibonacciRec(a, b, c);
                }
                // tuo atveju jei b>=c bet a<=c spausdinam tik a;
            } else {
                System.out.print(a + " ");
            }
        }

    }

    public static int determinant(int[][] arr) {
        int det = 0;
        int l = arr.length;
        int[][] arrD = new int[l - 1][l - 1];

        if (l < 2) {
            det = arr[0][0];
            return det;
        }
        if (l == 2) {
            det = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
//            System.out.println("DET=" + det);
//spausdinam visus 2*2 matrix'us
//            for (int i = 0; i < l; i++) {
//                for (int j = 0; j < l; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
            return det;
        } else {
            //   spausdinam arr arreju ir klonuojam ji i arrT;
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");

//kostruojam Det||  arreju arrD: 
            for (int a = 0; a < l; a++) {
                for (int i = 0; i < l - 1; i++) {
                    for (int j = 0; j < l - 1; j++) {
                        if (a <= j) {
                            arrD[i][j] = arr[i + 1][j + 1];
//                            System.out.print(arrD[i][j]);
                        }
                        if (a > j) {
                            arrD[i][j] = arr[i + 1][j];
//                            System.out.print(arrD[i][j]);
                        }
                    }
//                    System.out.println("");
                }
//                System.out.println("");

                det += (a % 2 == 0) ? arr[0][a] * determinant(arrD) : -(arr[0][a] * determinant(arrD));
//                System.out.println("(arr[0][a]= " + arr[0][a] +" a= " + a);
//                System.out.println("(a % 2 == 0)" + (a % 2 == 0));
//the number of times recursion is going to be called:                 
            }

        }
        return det;
    }

    public static void cars(char cars[], double dist[], int finish) {

        while (dist[0] < finish) {
//generuojam zingsni kiekvienai masinai:
            for (int i = 0; i < dist.length; i++) {
                double step = Math.random() * 10;
                dist[i] += step;

            }
//isrusiojam pagal nueita atstuma nuo didziausios iki maziausio ir atitinkamai isdeliojam masineles:
            for (int i = 0; i < dist.length - 1; i++) {
                if (dist[i] < dist[i + 1]) {
                    double t = dist[i + 1];
                    char a = cars[i + 1];

                    dist[i + 1] = dist[i];
                    cars[i + 1] = cars[i];

                    dist[i] = t;
                    cars[i] = a;

                    i = -1;
                }
            }
//spausdinam zingsni kiekvienai masinai pries tai suapvalinus zingsi iki 100-uju:
            for (int i = 0; i < cars.length; i++) {
                double stepR = Math.round(dist[i] * 100);
                stepR = stepR / 100;
                System.out.println("car: " + cars[i] + " is at: " + stepR + " km.");
            }
            System.out.println("");
        }
        System.out.println("THE WINNER IS: " + cars[0]);
    }

}
