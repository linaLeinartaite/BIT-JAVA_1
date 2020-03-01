/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200227_newserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Lina
 */
public class Service {

    private Socket socket;

    public Service(Socket socket) {
        this.socket = socket; // konstruktorius tiesiog issisaugo socket'a;
    }

    //methodas run() 
    public boolean run() { //cia boolean vietoj void  ir pakeistas run() main'e;
        // is socketo paimu input streama ir pasakau kad tai bus UTF-8;
        try (InputStream is = this.socket.getInputStream();
                Reader r = new InputStreamReader(is, "UTF-8");
                BufferedReader br = new BufferedReader(r)) {

            String requestLine = br.readLine(); //nuskaitom viena (tik pirmaja eilute) ir tokiu budo zinom kad narsykle nuskaite bent viena eilute 
            //jei mano request line yra null arba tuscias stringas asd tiesiog return'inu:
            //         String requestLine2 = br.readLine(); //antra eilute 
//            String requestLine3 = br.readLine(); //trecia eilute
//            String requestLine4 = br.readLine();
//            String requestLine5 = br.readLine(); 
            System.out.println("requestLine: " + requestLine);

            if (requestLine == null || "".equals(requestLine)) { //!!!! svarbu kad .equals(equestLine) del null pointer exepcion jei rasytume atvirksciai
                return true;
            }
            String[] rp = requestLine.split(" "); // rp ==request path;
            if (rp.length < 3) { //nes narsykle tikrai paduos stringa su trimis elementais;
                return true;
            }
            String path = rp[1];
            if ("/quit".equalsIgnoreCase(path)) {
                System.out.println("path: " + path);// >> path: /quit
                System.out.println("rp: " + rp[0] + rp[1] + rp[2]); // >> rp: GET/quitHTTP/1.1
                //          NewServer.shouldOuit = true; // sita mes galime kviesti tik tuo atveju jei shouldOuit >>
                //>> yra static nes tokio kintamojo tiesiog nera; //jei butu doug thread'u tai reiktu griszti prie >>
                // >> shouldQuit vietoj go  (void vietoj boolean)
                okResponse("BYE");
                return false;
            }
//            okResponse("HELLO");

            Path p = Paths.get(NewServer.WEB_ROOT, path);
            File rf = p.toFile(); //toFile() ??

            if (rf.exists()) {

                if (rf.isDirectory()) {
//                  
                    String content = "<html><body>";
                    File[] fl = rf.listFiles();

                    for (File f : fl) {
                       
//ND: kad displejintu direktorijos turini kaip linkus ir paspaudus galetum ieiti toliau: 
                        content += " <a href=" + f.getName() + "/>" + (f.getName()) + "</a><br>";

                    }
                    content += "</body></html>";
                    okResponse(content);

//                }     
                } else { //JEI TAI NE direktorija o file'as
                    try (InputStream fis = new FileInputStream(rf);
                            Reader fr = new InputStreamReader(fis, "UTF-8")
//                            BufferedReader fbf = new BufferedReader(fr)
                            ){
                        String content = "";
                        int b;
                        
                        while ((b = fr.read()) != -1) {
                            content += (char) b;
                        }
                        okResponse(content);
                    } catch (Exception ex) {
                        failResponse(ex);
                    }
                }

            } else {
                notFoundResponse();
            }

        } catch (Exception ex) {
            failResponse(ex);
        } finally {
            try {
                this.socket.close();
            } catch (Exception ex) {
                //Ignore
            }
        }
        return true;
    }

    private void okResponse(String res) {
        try (OutputStream os = this.socket.getOutputStream();
                Writer w = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(w)) {
            bw.write("HTTP/1.1 200 OK"); ///cia toks response'as jei viskas gerai 
            bw.newLine();
            bw.write("Cache-control: no-cache"); // sita eilute sako narsyklei: tai ka tu gausi NEKESHUOK t.y spausdink viska is karto
            bw.newLine(); //kad pereiti i nauja eilute
            bw.newLine();// turi buti eilute pagal HTTP protokola

//            bw.write("<html><body>");
//            bw.newLine();
            bw.write(res);
            bw.newLine();
//            bw.write("<br>LABAS PASAULI<br> LABAS!!!<br><button style='color: red;'>CLICK</button></body></html>");
//            bw.newLine();
//            bw.flush();
        } catch (Exception ex) {
            System.out.println("Failed to send responce: " + ex.getMessage());
        }
    }

    private void failResponse(Exception e) {
        try (OutputStream os = this.socket.getOutputStream();
                Writer w = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(w)) {
            bw.write("HTTP/1.1 500 ServerError"); ///cia toks response'ass reiskia blogai
            bw.newLine(); //kad pereiti i nauja eilute
            bw.newLine();// turi buti eilute pagal HTTP protokola
            bw.write(e.getMessage());
            bw.newLine();
        } catch (Exception ex) {
            System.out.println("Failed to send responce: " + ex.getMessage());
        }
    }

    private void notFoundResponse() {
        try (OutputStream os = this.socket.getOutputStream();
                Writer w = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(w)) {
            bw.write("HTTP/1.1 404 NOT FOUND"); ///cia toks response'ass reiskia blogai
            bw.newLine(); //kad pereiti i nauja eilute
            bw.newLine();// turi buti eilute pagal HTTP protokola            
            bw.newLine();
        } catch (Exception ex) {
            System.out.println("Failed to send responce: " + ex.getMessage());
        }
    }
}
