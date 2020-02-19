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
        //creating new list of stuf to buy:
        MyList toBuyToDay = new MyList();

        //creating ToBuy objects that are going to be added to the toBuyToDay:
        ToBuy soap = new ToBuy("soap", 10);
        ToBuy fish = new ToBuy("fish", 3);

        //creating and adding objects to toBuyToDay:
        toBuyToDay.add(new ToBuy("meat"));
        toBuyToDay.add(new ToBuy("milk"));
        toBuyToDay.add(new ToBuy("bread", 2));

//printing out toBuyToDay list:
        System.out.print("toBuyToDay: ");
        for (int i = 0; i < toBuyToDay.list.length; i++) {
            System.out.print(" " + toBuyToDay.list[i]);
        }
        System.out.println("");

//adding previously created objects to toBuyToDay:
        toBuyToDay.add(soap);
        toBuyToDay.add(fish);

//removing previously created objects to toBuyToDay:
        toBuyToDay.remove(6);
        toBuyToDay.remove(3);
// 
//Set:
        System.out.println("");
        System.out.println("SET:");
        toBuyToDay.set(0, soap);
          toBuyToDay.set(-7, soap);
//Get:
        System.out.println("");
        System.out.println("GET:");
        toBuyToDay.get(3);
//Length:
        System.out.println("");
        System.out.println("measuring length:");
        toBuyToDay.size();

        System.out.println("");
        System.out.print("toBuyToDay: ");
        for (int i = 0; i < toBuyToDay.list.length; i++) {
            System.out.print(" " + toBuyToDay.list[i]);
        }
        System.out.println("");
        
         Task[] toDo = {
             new Task("20200215", "Eurovision"),
             new Task("20200221", "Shoe Shopping"),
             new Task("20200229", "Viena Trip"),
             new Task("20200221", "Meet Up with Classmates")
         };
        
        //creating new list
        MyList toDoThisWeek = new MyList();
        MyList toDoThisMonth = new MyList(toDo);
       
        //adding new Tasks:
        toDoThisWeek.add(new Task("20200219", "Dancing Class"));
        toDoThisWeek.add(new Task("20200220", "JAVA's Home Work"));
        toDoThisWeek.add(new Task("20200223", "Cepelinai Party"));
        
//printing Tasks in toDoThisWeek list:
        System.out.println("");
        System.out.print("toDoThisWeek: ");
        for (int i = 0; i < toDoThisWeek.list.length; i++) {
            System.out.print(" " + toDoThisWeek.list[i]);
        }
        System.out.println("");
        System.out.println("GET");
        toDoThisWeek.get(3);  
        
        //printing Tasks in toDoThisWeek list:
        System.out.println("");
        System.out.print("toDoThisMonth: ");
        for (int i = 0; i < toDoThisMonth.list.length; i++) {
            System.out.print(" " + toDoThisMonth.list[i]);
        }
        System.out.println("");
    }

}
