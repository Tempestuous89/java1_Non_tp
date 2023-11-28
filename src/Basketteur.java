import java.util.Objects;

public class Basketteur extends Athlete {
    int nb_titre_NBA;
    int nb_Paniers;

    public Basketteur(String id, String nom, int age, String sport, int nb_titre_NBA, int nb_Paniers) {
        super(id, nom, age, sport);
        this.nb_titre_NBA = nb_titre_NBA;
        this.nb_Paniers = nb_Paniers;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Basketteur that = (Basketteur) o;
        return nb_titre_NBA == that.nb_titre_NBA && nb_Paniers == that.nb_Paniers;
    }



}
