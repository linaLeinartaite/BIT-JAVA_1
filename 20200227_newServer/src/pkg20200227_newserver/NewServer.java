/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200227_newserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lina
 */
public class NewServer {

    /**
     * @param args the command line arguments
     */

//    public static boolean shouldOuit = false;
    public static final int PORT = 8080; //taip (public static final) faktiskai apsibreziame konstanta!!
    public static final String WEB_ROOT = "C:\\Users\\Lina\\Documents\\NEW_LIFE";

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(PORT);
        boolean go = true;
       // while (!shouldOuit ) { 
        while (go) { //cia serveris suksis tol kol kazkas nepakeis i true
            Socket s = ss.accept();     //sitas susikuria kai kazkas prisijungia;    
            Service srv = new Service(s); //
            go=srv.run(); //musu sukurtas methodas run tures nuspresti ko nori narsykle, padaryti, ir tures uzdaryti socket'a;
        }
        ss.close();
    }

}
