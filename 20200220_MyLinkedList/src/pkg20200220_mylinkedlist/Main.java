/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200220_mylinkedlist;

/**
 *
 * @author Lina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
//        System.out.println(a.size());
//        System.out.println(a.head);
        a.add("vienas");
        a.add("du");
//        System.out.println(a.head.value); ///??????
//        System.out.println(a.head.next.value);
        System.out.println(a.get(0));
        System.out.println(a.get(3));
//        a.add("du");
        a.add("trys");
        a.add("keturi");
        a.add("penki");
        System.out.println( " a.size: " + a.size());
////        System.out.println(a.get(1));
         a.remove(0);
        System.out.println( " a.size: " + a.size());
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        System.out.println(a.get(4));
System.out.println("..........");
        a.remove(1);
        a.set(6, "dududu");
//        System.out.println(a.size());
//        System.out.println(a.get(1));
//        System.out.println(a.get(2));
//        System.out.println(a.get(3));
//        System.out.println(a.get(4));
//        System.out.println(a.get(5));
////        System.out.println(a.head.value); ///??????
//        System.out.println(a.head.next.value);

    }

}
