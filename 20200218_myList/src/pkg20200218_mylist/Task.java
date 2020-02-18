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
public class Task {
    protected String date;
    protected String toDo;    

    public Task(String date, String toDo) {
        this.date = date;
        this.toDo = toDo;
    }

    @Override
    public String toString() {
        return "Task{" + "date=" + date + ", toDo=" + toDo + '}';
    }
    
}
