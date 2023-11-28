import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TabAthletes extends Athlete{
    private Athlete[] Tathlete =  new Athlete[4];

    public TabAthletes(String id, String nom, int age, String sport) {
        super(id, nom, age, sport);
    }

    public void remplirTableaux(){
        Tathlete[0]= new Athlete("M444","Achraf",21,"Footballeur");
        Tathlete[1]= new Athlete("M333","Anas",30,"Basketteur");
        Tathlete[2]= new Athlete("M222","Hamid",21,"Basketteur");
        Tathlete[3]= new Athlete("M111","Housssam",22,"Basketteur");
    }

    public void trier (Comparator<Athlete> cmp){
        Arrays.sort(Tathlete,cmp);
    }

    public void ajouter (Athlete a){
        ArrayList<Athlete> athletes =new ArrayList<>(Arrays.asList(Tathlete));
        athletes.add(a);
        Tathlete = athletes.toArray(new Athlete[athletes.size()]);
    }

    public boolean existeAthlete(Athlete cible){
        for(Athlete ath: Tathlete){
            if (ath.equals(cible))
                return true;
        }
        return false;
    }
    public boolean supprimer (Athlete a){
        if(!this.existeAthlete(a)) return false;
        ArrayList<Athlete> athletes =new ArrayList<>(Arrays.asList(Tathlete));
        athletes.remove(a);
        Tathlete = athletes.toArray(new Athlete[athletes.size()]);
        return true;
    }

    public int nbAthletes(){
        return Tathlete.length;
    }

    public void inverser(){
        ArrayList<Athlete> liste = new ArrayList<Athlete> (Arrays.asList(Tathlete));
        Collections.reverse(liste);
        Tathlete=liste.toArray(new Athlete[liste.size()]);
    }

    @Override
    public String toString() {
        return "TabAthletes{" +
                "Tathlete=" + Arrays.toString(Tathlete) +
                '}';
    }

    public void plusGrand(){
        trier(new ComparatorSport());
        System.out.println("Plus vieux athlete: " + Tathlete[Tathlete.length-1].getAge());
    }



}
