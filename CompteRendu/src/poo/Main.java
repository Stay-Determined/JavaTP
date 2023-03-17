package poo;

import poo.rental.Camel;
import poo.rental.Car;
import poo.rental.CarRental;

public class Main {
    public static void main(String[] args) {
        /*Car mustang = new Car("ford mustang", 2014);
        System.out.println(mustang);
        CarRental test = new CarRental();
        test.add(mustang);
        test.affichage();
        */
        Camel camel = new Camel(2014);
        System.out.println(camel);
        CarRental rental = new CarRental();
        rental.add(new Car("ford mustang", 2014));
        rental.add(new Camel(2010));
    }
}