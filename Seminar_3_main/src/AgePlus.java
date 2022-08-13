import java.util.Comparator;

/**
 * Компаратор, который берет возраст одного человека и вычитает возраст другого человека,
 * соответственно разница может быть +, - или 0
 * происходит сортировка от меньшего к большему
 */
public class AgePlus implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
