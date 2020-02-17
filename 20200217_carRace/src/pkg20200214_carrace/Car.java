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
public class Car {
//normali praktika: statai visass savybes private ir TIK  TUOMET KAI TAU REIKIA didini prieinamuma!!!
    private String name;
    protected double speed;
    protected int maxSpeed; //kad SportsCar matytu sita t.y. je private tai matoma si savybe tik klaseje masina;
    protected double distance;

    public Car(String name) {
        this.name = name;
        speed = 0;
        distance = 0;
        this.maxSpeed = 200;
        //masina turi tureti tris methodus: gazuok stabdyk ir vaziuok;

    }

    public void speedUp(double km) {
        this.speed += km;
        if (this.speed >= this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    public void slowDown(double km) {
        this.speed -= km;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public void go() {
        this.distance += this.speed;//greitis yra nuovaziuotas kelio gabalas per viena cikla;

    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", speed=" + speed + ", maxSpeed=" + maxSpeed + ", distance=" + distance + '}';
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}
