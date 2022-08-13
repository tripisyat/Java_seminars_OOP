import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vanya", "Set", 20));
        persons.add(new Person("Sergey", "As", 54));
        persons.add(new Person("Alexa", "Gar", 18));

        System.out.println("сортируем наш список по возрасту созданным нами компаратором от меньшего к большему");
        persons.sort(new AgePlus());
        System.out.println(persons);

        System.out.println("--------");

        System.out.println("сортируем наш список по возрасту созданным нами компаратором от большего к меньшему");
        persons.sort(new AgeMinus());
        System.out.println(persons);

        System.out.println("--------");

        System.out.println("сортировка по имени, используя лямбду");
        persons.sort((p1,p2)-> p1.getName().compareTo(p2.getName()));//лямбда в скобках
        System.out.println(persons);

        System.out.println("--------");
        /**
         * сортировка анонимным классом.
         * то есть мы переопределяем стандартный компаратор прямо сразу здесь
         * и в методе прописываем по какому полю будем сравнивать и сортировать
         * мы не делаем ни переменной, ни отдельного класса
         */
        System.out.println("Сортировка анонимным классом");
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurname().compareTo(p2.getSurname());
            }
        });

        System.out.println(persons);

        System.out.println("--------");

        /**
         * Comparable - стандартный интерфейс Java, его прописывают как имплементивный к какому либо классу
         * и в нем же его и переопределяют,
         * таким образом не пишется отдельный класс компаратор, а нужный класс делаем сравниваемым
         */
        System.out.println("Без явной передачи компоратора");
        Collections.sort(persons);// используем Collections, но предварительно класс Person делаем implements Comparable<Person>
        System.out.println(persons);









    }
}
