import java.util.Objects;

public class Athlete implements Cloneable, Comparable<Athlete>  {
    private String id;
    private String nom;
    private int age;
    private String sport;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Athlete(String id, String nom, int age, String sport) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.sport = sport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return age == athlete.age && Objects.equals(id, athlete.id) && Objects.equals(nom, athlete.nom) && Objects.equals(sport, athlete.sport);
    }


    public void entrainement(){
        System.out.println(nom+ " s'entraine pour ameliorer ses performances");
    }


    @Override
    public int compareTo(Athlete a){
        return this.id.compareTo(a.id);
    }

    @Override
    public Athlete clone() {
        try {
            return (Athlete) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
