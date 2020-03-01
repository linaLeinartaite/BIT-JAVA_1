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
public class MyLinkedList {

    protected Node head;

    //conctructor
    public MyLinkedList() {
        head = null;

    }

    //add
    public void add(Object oIn) {
        Node n = new Node();
        n.value = oIn;

        if (head == null) {
            head = n;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n;
        }
    }
//remove

    public void remove(int index) {
         if (index <= 0 || index> this.size()) {
            return;
        }
        int count = 0;
        Node tempF = head;
        if (index == 1) {
            head = head.next;
        }
        while (count < index - 2) {
            tempF = tempF.next;//   cia pradzia     
            count++;
        }
        Node tempE = tempF.next.next;
        tempF.next = tempE;
    }

    public void set(int index, Object oIn) {
        if (index <= 0 || index> this.size()) {
            return;
        }
        int count = 0;
        Node n = new Node();
        n.value = oIn;
        Node tempF = head;
        if (index == 1) {
            head.value = oIn;
        }
        while (count <= index - 2) {
            tempF = tempF.next;//   cia pradzia     
            count++;
        }//    
        tempF.value = oIn;        
        //jei (count == index - 1 >>> cia paskutinis node'as
        if (count != index - 1) {
            Node tempE = tempF.next.next; //galas            
            n.next = tempE;
        }
    }

    //size
    public int size() {
        int count = 0;
        if (head == null) {
            return count;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                count++;
            }
            count++;
        }
        return count;
    }

    //get
    public Object get(int no) {
        int count = 0;
        Node temp = head;
        if (head == null || no <= 0) {
            return null;
        } else if (count < no) {
            count++;
            while (count < no) {
                temp = temp.next;
                count++;
                if (temp == null) {
                    return null;
                }
            }
        }
        return temp.value;
    }

    protected class Node {

        Node next;
        Object value = null;
    }
}
