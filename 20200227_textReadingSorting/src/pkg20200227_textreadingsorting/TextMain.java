/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200227_textreadingsorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Comparator;

/**
 *
 * @author Lina
 */
public class TextMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        try (InputStream is = new FileInputStream("textIn.txt");
                Reader r = new InputStreamReader(is, "UTF-8"); //grazina po raide
                BufferedReader br = new BufferedReader(r); //grazina po eilute

                OutputStream os = new FileOutputStream("textOut.txt");
                Writer w = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(w)) {
            int b;
            int count = 0;
            char c;

            while ((b = is.read()) != -1) {
//            System.out.println("b: " + b);
                c = (char) b; // cia raidziu koda vercia i raides;
//                System.out.println("c " + c);
                if (c == ' ') {
                    bw.newLine();
                    continue;
                }
                if(c=='.' || c=='(' ||c==')' ||c==',' ||c==':' ||c==';')
                {continue;}
                bw.write(c);
                count++;
//                System.out.println("count: " + count);
            }

        }
        String s;
        int count2 = 0;
        String[] arr = new String[0];
        try (
                InputStream is2 = new FileInputStream("textOut.txt");
                Reader r2 = new InputStreamReader(is2, "UTF-8"); //grazina po raide
                BufferedReader br2 = new BufferedReader(r2))
        {        

            while ((s = br2.readLine()) != null) {
                count2++;
//                System.out.println("s: " + s);
            }
        }
        try (
                InputStream is2 = new FileInputStream("textOut.txt");
                Reader r2 = new InputStreamReader(is2, "UTF-8"); //grazina po raide
                BufferedReader br2 = new BufferedReader(r2))
        {            
            arr = new String[count2];
            count2 = 0;
            while ((s = br2.readLine()) != null) {
//                System.out.println(arr[count2]+" " + s);
                arr[count2] = s;
                count2++;
            }

            String temp;
                for(int i=0; i<arr.length-1; i++){
                    if(arr[i].length()<arr[i+1].length()){
                        temp= arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        i=-1;
                    }                
                }
             }
        
        try (
                InputStream is2 = new FileInputStream("textOut.txt");
                Reader r2 = new InputStreamReader(is2, "UTF-8"); //grazina po raide
                BufferedReader br2 = new BufferedReader(r2); //grazina po eilute
                OutputStream os2 = new FileOutputStream("textOut2.txt");
                Writer w2 = new OutputStreamWriter(os2, "UTF-8");
                BufferedWriter bw2 = new BufferedWriter(w2)) {
     
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr[i]"  + arr[i]);
                bw2.write(arr[i]);
                bw2.newLine();
            }   
        }
    }
}
