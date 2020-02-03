/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200203_math_atsgameoflifes;

/**
 *
 * @author Lina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DESTYTOJO SPRENDIMAS
        System.out.println("..........");
        System.out.println("GAME OF LIFE");
        int size = 20;
        int cycles = 100;
        char[][] field = new char[size][size];
//        char[][][] fieldsAll = new char[cycles + 1][size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                /*
            sugeneruosime atsitiktine lenta (kuri is ties nera atsitiktine)
            tuscias langelis bus zymimas tarkim bruksneliu 
            o uzimtas >> x'u;
                 */
                if (Math.random() < 0.25) {
                    field[i][j] = 'X';
                } else {
                    field[i][j] = '-';
                }
            }
        }
        System.out.println("................");
        System.out.println("RANDOM FIELD");
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print(field[x][y]);
            }
            System.out.println("");

        }
        System.out.println("................");

        char[][][] history = new char[cycles][size][size];
        for (int i = 0; i < cycles; i++) {
            history[i] = field;
            char[][] newField = new char[size][size];

            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    //kk == kaimynu kiekis; 
                    int kk = 0;

                    if (y > 0) {
                        kk += (x > 0 && field[y - 1][x - 1] == 'X') ? 1 : 0;
                        kk += (field[y - 1][x] == 'X') ? 1 : 0;
                        kk += (x < size - 1 && field[y - 1][x + 1] == 'X') ? 1 : 0;
                    }
                    kk += (x > 0 && field[y][x - 1] == 'X') ? 1 : 0;
                    kk += (x < size - 1 && field[y][x + 1] == 'X') ? 1 : 0;

                    if (y < size - 1) {
                        kk += (x > 0 && field[y + 1][x - 1] == 'X') ? 1 : 0;
                        kk += (field[y + 1][x] == 'X') ? 1 : 0;
                        kk += (x < size - 1 && field[y + 1][x + 1] == 'X') ? 1 : 0;
                    }
                    if (field[y][x] == 'X') {
                        if (kk >= 2 && kk <= 3) {
                            newField[y][x] = 'X';
                        } else {
                            newField[y][x] = '-';
                        }
                    } else {
                        if (kk == 3) {
                            newField[y][x] = 'X';
                        } else {
                            newField[y][x] = '-';
                        }
                    }
                }
            }
            ///   palyginimas pirmo ir antro  arejaus:
            int h;
            for ( h = i; h >= 0; h--) {
                boolean match = true;
                for (int y = 0; match && y < size; y++) {
                    for (int x = 0; match && x < size; x++) {
                        match = history[h][y][x] == newField[y][x];
                    }
                }

// (!match) ==>> cia sako kad if match==false 
                if (match) {
                    break;
                }
            }
           
            
            System.out.println("FIELD NO:" + (i + 1));
            System.out.println("...........");
            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    System.out.print(newField[x][y]);
                }
                System.out.println("");

            }
             if (h>=0){
                System.out.println("ITERACIJA KARTOJASI " + h + " ZINGSNYJE.");
                break;
            }
             
            field = newField;
            System.out.println("");
        }

    }
}
