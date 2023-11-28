import java.util.Comparator;

public class ComparatorSport implements Comparator<Athlete> {
@Override
public int compare(Athlete a1,Athlete a2){
    return a1.getSport().compareTo(a2.getSport());
}
}
