/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200131_math;

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

        //namu darbai is  20200131
        //Nr 1.:
        System.out.println(".............................");
        System.out.println("Nr1:");
        int[] m = {1, 2, 3, 4, 5};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[(j+i) % m.length]);
                /*
                kas cia vyksta :
                i=0,j=0; m[(i + j) % m.length]=0;
                i=0,j=1; m[(i + j) % m.length]=1/5 =5 (liekana yra 5);
                ...
                i=0,j=4: m[4]=5;              
                ...
                antra eilute  >>NAMU DARBUOSE TURI BUTI KAS PO SITO:
                i=1,j=0: m[1]=2; >> [4]
                i=1,j=1: m[2]=3; >> [0]
                i=1,j=2: m[3]=4; >> [1]
                i=1,j=3: m[4]=5; >> [2]
                i=1,j=4: m[0]=1; >> [3]
                
                              
               NAMU DARBAS PADARYTI KAD VAZIUOTU I KITA PUSE
                 */
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println(".............................");
        System.out.println("Nr2:");
        int[] arr = {4, 17, 2, -4, 22, 101};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    /*
                    kaip veikia:
                    po pirmos isorinio ciklo iteracijos didziausia reiksnme iseina i virsu;
                    po antros- iteracijos  antras didziausias iseina i antra vieta arr[0];
                    ir taip vis imi didziausia likusi skaiciu ir vidinio pilno ciklo metu 
                    pastatai i sekantcia vieta;
                     */
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(".............................");
        System.out.println("Nr3:");

        int[][] arr2 = {
            {1, 2, 3},
            {1, -12}
        };

        int arr2L = 0;
        //pirma suzinom viso arrejaus ilgi
//cia kad suskaiciuoti ilgi masyvo >> ilgis yra visu jame esanciu arreju ilgiu suma

        for (int i = 0; i < arr2.length; i++) {
            arr2L += arr2[i].length;
        }
        //susikuri nauja masyva ==>> vienmati 
        int[] arr3 = new int[arr2L];
        int num = 0;
        //sudedu visuss elementu is eiles eidami per visa pirmo masyvo ilgi 
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr3[num++] = arr2[i][j];
            }
        }
        //cia padarom rusiavima vienmacio masyvo;
        int temp = 0;
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                temp = arr3[i + 1];
                arr3[i + 1] = arr3[i];
                arr3[i] = temp;
                i = -1;
            }
        }
        //ir tada kaip paemem visus elementus is eiles taip ir sudedam atgal
        num=0;
         for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr3[num++]; 
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
        System.out.println("..........");
        System.out.println("GAME OF LIFE");
         int size = 10;
        int cycles=100;
        char[][] field = new char[size][size];
        char[][][] fieldsAll = new char [cycles+1][size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                /*
            sugeneruosime atsitiktine lenta (kuri is ties nera atsitiktine)
            tuscias langelis bus zymimas tarkim nuliu 
            o uzimtas >> x'u;
                 */
                if(Math.random() <0.25){
                field[i][j] ='X';                
                }else{
                    field[i][j] ='-';
                }
            }
        }
        //ispausdinam field arreju
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j]);
            }
             System.out.println("");
         }
         System.out.println("");
         System.out.println("................"); 
         //istatom pirmaji laiuka i pozicia [0];
   fieldsAll[0]=field; 
 //generuojam antraji areju pagal 'gyvenimo taisykles'; 
    for(int it=0; it<cycles; it++)  {
        
        int count=0;
         char[][] fieldNew = new char[size][size];
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int nbr =0;
// skaiciuojam kaimynus (kiekvienm kaimynui po if'a :))
//esama eilute i; kaimynai: [i][j-1]; [i][j+1];
 if( j-1>=0 && field[i][j-1]=='X'){ nbr+=1;}
 if(j+1<size && field[i][j+1]=='X'){ nbr+=1;}
 // virsutine eilute: i-1; kaimynai: [i-1][j-1]; [i-1][j]; [i-1][j+1];
 if( i-1>=0 && j-1>=0 && field[i-1][j-1]=='X'){ nbr+=1;}
 if(i-1>=0 && field[i-1][j]=='X'){ nbr+=1;}
 if(i-1>=0 && j+1<size && field[i-1][j+1]=='X'){ nbr+=1;}
//apatine eilute: i+1; kaimynai: [i+1][j-1]; [i+1][j1]; [i+1][j+1];
 if(j-1>=0 && i+1<size && field[i+1][j-1]=='X'){ nbr+=1;}
 if(i+1<size && field[i+1][j]=='X'){ nbr+=1;}
 if( i+1<size && j+1<size && field[i+1][j+1]=='X'){ nbr+=1;}
 
//uzpildom nauja areju gyventojais:
 if(nbr==3){fieldNew[i][j]='X';}
 else if(nbr>3 || nbr<2) {fieldNew[i][j]='-';} 
 else{fieldNew[i][j]=field[i][j];}
 System.out.print(fieldNew[i][j]);
            }            
            //palyginam visus senus su nauju arejum:
            System.out.println("");   
            
        
for (int a = 0; a <= it; a++) {
    for (int b = 0; b < size; b++){
                for (int c = 0; c < size; c++){
               if( fieldNew[b][c]!= fieldsAll[a][b][c]){
                   count=0;                   
               break;
               } else if(count ==size*size){  
                   System.out.println("count:" + count);
                   System.out.println("a:" + a);
                   System.out.println("it:" + it);
                    break;                  
               } else{count++;}
        }
    }
    
}            
         } if(count!=size*size) { 
         count=0;    
         field=fieldNew;
         //i  surenkam visus arrejus:
         fieldsAll[it+1]=fieldNew;
         
         System.out.println("");
         System.out.println("................");
         System.out.println("");
             }else {
         count=0;       
         System.out.println("cycles: " + (it));         
         break;
     }    
    }
    System.out.println("");
         System.out.println("******");
        
  }
}
