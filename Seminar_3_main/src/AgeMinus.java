import javax.swing.*;
import java.util.Comparator;

/**
 * Тоже что и AgePlus, но
 * происходит сортировка от большего к меньшему
 */
public class AgeMinus implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p2.getAge()-p1.getAge();
    }
}
