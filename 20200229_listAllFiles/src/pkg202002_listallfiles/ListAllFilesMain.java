/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg202002_listallfiles;

import java.io.File;

/**
 *
 * @author Lina
 */
public class ListAllFilesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myFolder = "C:\\Users\\Lina\\Documents\\IN_BETWEEN";
        listAllFiles(myFolder);

    }
//ND: funkcija kuri isprintina visus file'us duotoje direktorijoje:
    public static void listAllFiles(String path) {
        File dir = new File(path);
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File f : files) {
                System.out.println(f);
                listAllFiles(f.toString());
            }
        } else {
            System.out.println(dir);
        }
    }

}
