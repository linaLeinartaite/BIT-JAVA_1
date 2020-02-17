/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200214_carrace;

/**
 *
 * @author Lina
 */
public class SportsCar extends Car {

    public SportsCar(String name) {
        super(name);
        this.maxSpeed = 400;
    }
    
    public void speedUp(double km) {
        this.speed += km*3;
        if (this.speed >= this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    public void slowDown(double km) {
        this.speed -= km*2;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
