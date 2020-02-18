/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200218_mylist;

/**
 *
 * @author Lina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.arraycopy()  turi penkis parametrus:
			 					1) masyvas is kurio copinti 
								2) nuo kurio elemento pradedant 
								3) i kuri masyva copinti 
								4) nuo kurio elemento irasineti 
								5) kiek elementu ikopinti;


         */

        ToBuy[] todayProducts = {
            new ToBuy("milk"),
            new ToBuy("bread"),
            new ToBuy("soup"),
            new ToBuy("fish")
        };
        MyList toBuyToDay = new MyList();

        ToBuy meat = new ToBuy("meat");
        ToBuy milk = new ToBuy("milk");
        ToBuy bread = new ToBuy("bread");
        ToBuy soup = new ToBuy("soup");
        ToBuy fish = new ToBuy("fish");
        toBuyToDay.add(meat);
        toBuyToDay.add(milk);
        toBuyToDay.add(bread);
        toBuyToDay.add(soup);
        toBuyToDay.add(fish);
        toBuyToDay.remove(6);
        toBuyToDay.remove(3);
        toBuyToDay.set(7, soup);
        toBuyToDay.get(3);
        toBuyToDay.size();
//        System.out.println("todayProducts" + todayProducts);
        System.out.println("toBuyToDay: ");
        for (int i = 0; i < toBuyToDay.list.length; i++) {
            System.out.print(" " + toBuyToDay.list[i]);
        }
        System.out.println("");
    }

}
