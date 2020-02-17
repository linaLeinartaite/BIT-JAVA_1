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
public class SlowCar extends Car {

    public SlowCar(String name) {
        super(name);
        this.maxSpeed = 200;
    }

    public void go() {
        this.distance += (this.speed/2);//greitis yra nuovaziuotas kelio gabalas per viena cikla;
//        this.distance = (this.distance / 2);
    }

}
