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
public class CarRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // susikuriam masinu masyva:
        //    Car[] all = new Car[3]; // cia susikurem masyva kuriame galim tureti 3-is masinas; [0: null, 1:null, 2:null]
        //    all[1] = new Car("Car-1");  //cia masyve all elementui su index=1 (antram el) priskiriaam sukurta masuna "Car-1";

//mes cia kursim kitaip:
        Car[] allCars = {
            new Car("Car-1"),
            new Car("Car-2"),
            new Car("Car-3"),
            new Car("Car-4"),
            new Car("Car-5"),
            new Car("Car-6"),
            new SportsCar("SportsCar-1"),
            new SportsCar("SportsCar-2"),
            new SlowCar("SlowCar-1"),
            new SlowCar("SlowCar-2")
        };

        //kiekviana is masinu per zingsni  turi pagazuot arba pastabdyt
        //kiekvienai masinai priimamas sprendimas ar ji gazuos ar stabdys 
//<0.3 ==> stabdys, >=0.3 ==>> gazuos;
        double finish = 1000;
        //kartojasi iki tol kol pasiekia kazkuri masina finish km;
        while (allCars[0].getDistance()
                < finish) {
            for (int i = 0; i < allCars.length; i++) {
                double step = Math.random();
                if (step < 0.3) {
                    allCars[i].slowDown(Math.random() * 10);
                } else {
                    allCars[i].speedUp(Math.random() * 15);
                }
                //ir tada turi pajudeti per toki atstuma jei stabdo tai greitis turi pasikeist per  1-10; jei gazuoja tai per 1-15;
                allCars[i].go();
            }
           
//3.SUrusiuoti
            Car[] allCarsTemp = new Car[allCars.length];

            for (int i = 0; i < allCars.length - 1; i++) {
                if (allCars[i].getDistance() < allCars[i + 1].getDistance()) {
                    allCarsTemp[i] = allCars[i + 1];
                    allCarsTemp[i + 1] = allCars[i];
                    allCars[i] = allCarsTemp[i];
                    allCars[i + 1] = allCarsTemp[i + 1];
                    i = -1;
                }//             
            }

//        allCars = allCarsTemp;
            //4.Atspausdint
            for (int i = 0; i < allCars.length; i++) {
//                System.out.println(allCars[i].toString());
                 System.out.printf("name:%s speed:%.0f distance:%.0f \n", allCars[i].getName(), allCars[i].getSpeed(), allCars[i].getDistance() );
            }

            System.out.println("..................");
        }

        System.out.println(
                "THE WINNER IS: " + allCars[0].getName() + ".");

        ///kam per paprasta PRIDEKITE LETA MASINA : kurios greitis keisis taip pat bet ji vaziuos dvigubai leciau;
        //t.y. jei jos greitis 50 tai leta massina nuvaziuos 25;
    }

}
