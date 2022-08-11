import java.util.Comparator;
import java.util.List;

public class AgeComparater implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
