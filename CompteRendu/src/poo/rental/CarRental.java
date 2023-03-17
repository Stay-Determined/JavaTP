package poo.rental;

import java.time.LocalDate;
import java.util.*;

public class CarRental {
    private int size = 0;
    Car[] test = new Car[size];
    public void add(Car maVoiture) {
        if (maVoiture.toString() == null)
            return;
        Car[] vList = new Car[size + 1];
        for (int i = 0; i < size; i++) {
            vList[i] = test[i];
        }
        vList[size] = maVoiture;
        size = size + 1;
        test = vList;
    }

    public void remove(Car position) {
        int counter1= 0;
        int counter2= 0;
        for (int n = 0; n<size; n++) {
            counter2+=1;
            if (test[n].modele != position.modele) {
                continue;
            }else{
                counter1+=1;
                test[n] = null;
            }
        }
        if(counter1 != 0){
        size -= 1;
        }else{throw new IllegalStateException();}
    }

    public String toString(){
        String maListe = "";
        for (int i = 0; i < size; i++){
            maListe += test[i];
            if (i == test.length-1){
                break;
            }else {
                maListe+="\n";
            }
        }
        return maListe;
    }

    public void affichage() {
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + "\n");
        if(i == test.length){
            System.out.println(test[i]);
            }
        }
    }

    public List<Object> toSell() {
        int currentYear = LocalDate.now().getYear();
        List<Object> vehiclesToSell = new ArrayList<>();

        for (Object vehicle : test) {
            if (vehicle instanceof Car && currentYear-2 >= ((Car) vehicle).anneeFabric) {
                vehiclesToSell.add(vehicle);
            } else if (vehicle instanceof Camel && currentYear-5 >= ((Camel) vehicle).anneeFabric) {
                vehiclesToSell.add(vehicle);
            }
        }

        return vehiclesToSell;
    }

    public Optional<Car> findACarByModel(String n) {
        for (Car car : test) {
            if (car.getModel().equals(n)) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CarRental)) {
            return false;
        }
        CarRental other = (CarRental) obj;
        return Objects.equals(test, other.test);
    }



}
