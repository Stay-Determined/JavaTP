package poo.rental;

import java.util.Objects;

public class Camel extends Car{
    int f;

    public Camel(int anneeFabric) {
        super(anneeFabric);
        this.modele= "camel";
        this.anneeFabric = anneeFabric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camel)) {
            return false;
        }
        Camel other = (Camel) obj; // Cast obj en Person
        return Objects.equals(modele, other.modele) && anneeFabric == other.anneeFabric;
    }
}
