/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200229_snails;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lina
 */
public class Snail extends Thread {

    protected String name;
    double dist;
    public static final List times = new ArrayList();
    public static String winner;
    Date started;

    public Snail(String name) {
        this.name = name;
        this.dist = 0;

    }

    @Override
    public void run() {
        Date started = new Date();
      
        while (dist <= SnailsMain.finish) {
            //moves 1-5cm            
            dist +=(int) (Math.random() * 5) + 1;
            System.out.println("Snail " + name + " is at: " + dist + "cm.");

            //sleeps 10-20ms
            if (dist < SnailsMain.finish) {
              
                try {
                    Thread.sleep((int) (Math.random() * 10) + 10);
                } catch (InterruptedException ex) {
//Ignore
                }
            }
        }
        Date finished = new Date();
       synchronized(times){                         //ar gliu taip daryti???
        times.add((finished.getTime() - started.getTime()));
       } 
        System.out.println("Snail " + name + " " + "reached finish!");

        if (times.size() == 1) {
            winner = this.name;
        }
        if (times.size() == SnailsMain.noOfSnails) {
            System.out.println("");
            System.out.println("THE WINNER SNAIL IS: " + winner + "!!! \nIt reached the finish in " + times.get(0) + " milliseconds.");
//            System.out.println(this.times);
        }
    }
}
