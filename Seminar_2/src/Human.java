/**
 * Абстрактный класс общий шаблон для наследующих классов
 */
public abstract class Human {
    protected String name;
    protected String surname;

    protected Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
