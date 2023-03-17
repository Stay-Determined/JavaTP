package poo.rental;

import java.util.Objects;

public class Car {
    String modele;
    int anneeFabric;

    public Car(String modele, int anneeFabric) {
        Objects.requireNonNull(modele);
        this.modele = modele;
        this.anneeFabric = anneeFabric;
    }

    public Car(int anneeFabric){
        this.anneeFabric=anneeFabric;
    }

    public String getModel() {
        return modele;
    }

    public int getAnneeFabric() {
        return anneeFabric;
    }

    public String toString(){
        return modele + " " + anneeFabric;
    }
    @Override
    public boolean equals(Object n) {
        if (n == this) {
            return true;
        }
        if (!(n instanceof Car)) {
            return false;
        }
        Car maVoiture = (Car) n;
        return Objects.equals(modele, maVoiture.modele) && anneeFabric == maVoiture.anneeFabric;
    }

}
