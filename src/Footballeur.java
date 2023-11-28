import java.util.Objects;

public class Footballeur extends Athlete{
    int nb_Cdm;
    int nb_But;
    String position;

    public Footballeur(String id,String nom, int age, String sport, int nb_Cdm, int nb_But, String position) {
        super(id, nom, age, sport);
        this.nb_Cdm = nb_Cdm;
        this.nb_But = nb_But;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Footballeur that = (Footballeur) o;
        return nb_Cdm == that.nb_Cdm && nb_But == that.nb_But && Objects.equals(position, that.position);
    }


}
