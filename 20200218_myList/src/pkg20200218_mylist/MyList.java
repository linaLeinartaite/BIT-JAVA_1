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
public class MyList {

    int l;
    Object[] list;

    //if you want to start with previously created list
    public MyList(Object[] list) {
        this.list = list;
        this.l = list.length;
    }

    //if you want to start with empty list
    public MyList() {
        this.list = new Object[0];
        this.l = list.length;
    }

    public void add(Object newO) {
        Object[] listT = new Object[l + 1];
        for (int j = 0; j < list.length; j++) {
            listT[j] = list[j];
        }
        listT[l] = newO;
        list = listT;
        l = l + 1;
//        System.out.println("product added: " + list[l-1]);
    }

    public void remove(int index) {
        if (index > l-1 || index<0) {
            System.out.println("There is no item with index " + index + " in "+ list[0].getClass().getSimpleName() +" list!");
        } else {
            Object[] listT = new Object[l - 1];
            l = l - 1;
            for (int j = 0; j < l; j++) {
                if (j >= index) {
                    listT[j] = list[j + 1];
                } else {
                    listT[j] = list[j];
                }
            }
            list = listT;
        }
    }

    public void set(int index, Object inO) {
        if (index > l - 1 || index < 0) {
            System.out.println("There is no item with index " + index + " in "+ list[0].getClass().getSimpleName() +" list!");
        } else {
            list[index] = inO;
        }
    }

    public Object get(int index) {
        if (index > l - 1 || index < 0) {
            System.out.println("There is no item with index " + index + " in "+ list[0].getClass().getSimpleName() +" list!");
            return index;
        } else {
            System.out.println("Item with index " + index + " is " + list[index] + ".");
            return list[index];
        }
    }

    public int size() {
        System.out.println("Length of " + list[0].getClass().getSimpleName() + " list is " + list.length + ".");
        return list.length;
    }

    @Override
    public String toString() {
        return "MyList{" + "l=" + l + ", list=" + list + '}';
    }

}
