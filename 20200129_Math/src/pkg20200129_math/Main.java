/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200129_math;

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
        System.out.println("PIRMA UZDUOTIS");
        float a = 2;
        float b = 10;
        float c = 44.5F; //F(arba f) prirasom nes java NESVEIKUS skaicius priima kaip double (tai mes parasydami pabreziam kad zinom kad cia bus tas vertimas i F)

        //skaiciuojam diskriminanta
        float d = b * b - 4 * a * c;
        System.out.println(d);

        //pirmasis if else!!!
        if (d >= 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a); // Math.sqrt(d)) yra double taigi kad prideti -b jis verciamas i double ir tada sudejus gauni double
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println("Nera sprendiniu");
        } //jei po else nedesime {}, tai else vygdys tik viena komanda ir System.out.println("Pabaiga"); veiks ir po if ir po else
        System.out.println("Pabaiga");
        System.out.println("");
        System.out.println("ANTRA UZDUOTIS");
        int sk = 33;
        if (sk < 0) {
            System.out.println("neigiamas");
        } else if (sk < 10) {
            System.out.println("mazas"); //!! else if {} vygdo tik VIENA komanda/block'a ir NEBAVYGDO tu kitu else'u!!
        } else if (sk < 100) {
            System.out.println("vidutinis");
        } else {
            System.out.println("didelis");
        }
        System.out.println("Pabaiga");
        System.out.println("");
        System.out.println("TRECIA UZDUOTIS");

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++; //be i++ (i=i+1) gausime infinite loop 
        }
        while (i <= 3) {
            System.out.println(i);
            i += 10; //be i++ (i=i+1) gausime infinite loop 
        }
        System.out.println("Pabaiga");
        System.out.println("");
        System.out.println("KETVIRTA UZDUOTIS");
        //parasyti programele kuri parasytu sk suma nuo 4 iki 17
        int j = 4;
        int sum = 0; //butina priskirti pradine reiksme, nors realiai default turetu buti 0, bet dabartiniai kompiliatoriai priima tai kad tai yra tavo pamirsta parasyti
        while (j <= 7) {
            sum = sum + j;
            j++;
            /*
            vietoj:  
            sum = sum + j; 
            j++;
            galima rasyti: 
            sum+=j++; 
            >> skaidome>> sum = sum+ j++; !!toliau reiskia kad paimsim j, panaudosime ja sitoj sudety ir tik tada padidinsime j
            >> sukeitus vietom (sum =  j++ +sum;) vistiek j++ eis gale (ir gausim teisinga ats;
            
           TACIAU jei pliusiukai is priekio,tai reiskia kad PIRMA PADIDINU vienetu ir tik tada darau veiksma, t.y.
            sum+=++j >> CIA SUMUOS NUO 5 iki 16            
             */
        }
        System.out.println(sum);
        System.out.println("Pabaiga");
        System.out.println("PENKTA UZDUOTIS");
        //do{} while{} ciklas

        do {
            System.out.println(sum);
            sum = sum + j;
            j++;
            //sum += j++; // cia sumuoja nuo 4 iki 7

        } while (j <= 7);
        System.out.println(sum);
        System.out.println("Pabaiga");
        System.out.println("SESTA UZDUOTIS");
        //sandauga visu nelyginiu sk nuo 2  iki 8

        int sk1 = 2;
        int times = 1;

        while (sk1 <= 8) {
            if (sk1 % 2 == 0) {
                sk1++;
            } else {
                times = times * sk1;
                sk1++;
            }
        }
        System.out.println("Sandauga yra:");
        System.out.println(times);
        /*
        sprendimas Nr 1. (tiesiog pradedam nuonelyginio == nepilnas sprendimas):
        int i=3;
        int san=1;
        while(i<=8) {
        san*=i;
        i+=2;
        }
         
        sprendimas Nr 2. zemiau kaip sekanti uzduotis>>       
         */

        System.out.println("Pabaiga");
        System.out.println("SEPTINTA UZDUOTIS");
        //sprendimas Nr 2.>>

        Scanner sc = new Scanner(System.in); //kai pabraukia parasius, salia reik paspausti ant raudonp/geltono burbuliuku ir pasirinkti kazka tokio kaip add import for java (pas mane buvo pirmas var)

        /*  
        System.out.println("skaicius nuo");
        int nuo = sc.nextInt();
        System.out.println("skaicius iki");
        int iki = sc.nextInt();
        int daug = 1; //nuo daugyba
        while (nuo <= iki) {
            if (nuo % 2 == 1) {
                daug = daug * nuo;
                System.out.println(daug);
            }
            nuo += 1;
        }
        System.out.println("Sandauga yra:");
        System.out.println(daug);
         */
        System.out.println("");
        System.out.println("");
        System.out.println("Home Work");
        System.out.println("FIBONACCI SEQUENCE");
        //parasyti loop'sa kad ivedus du pirmus skaicius ir glutini isprintintu fibbonaci seka.
        //kai pabraukia parasius, salia reik paspausti ant raudonp/geltono burbuliuku ir pasirinkti kazka tokio kaip add import for java (pas mane buvo pirmas var)
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        while (num1 < 0) {
            System.out.println("Fibonacci number must be a natural number (first number can be zero)!");
            System.out.println("Enter the first number:");
            num1 = sc.nextDouble();
        }
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        while (num2 <= 0 && num2<=num1) {
            System.out.println("Fibonacci number must be a natural number (first number can be zero, but second number can not be zero or smaller then first one)!");
            System.out.println("Enter the second number:");
            num2 = sc.nextDouble();
        }
        System.out.println("Enter the end number of Fibonacci sequence:");
        int end = sc.nextInt();
//        double k = 0;
        double temp = 0;
        if (num1 > end || num2 > end) {
            System.out.println("Fibonacci sequence is empty!");
        } else {
            System.out.println("num:" + "" + num1);
            System.out.println("num:" + "" + num2 + ", gR:" + "" + num2 / num1);
            while (num1 <= end) {
                temp = num1 + num2;
                num1 = num2;
                num2 = temp;
//                k = num2;                
                if (num2 <=end){
                    System.out.println("num:" + "" + temp + ", gR:" + "" + num2 / num1);
                }
            }
            
        }
        ;
    }
}

