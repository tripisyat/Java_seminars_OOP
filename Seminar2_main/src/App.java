/**
 * Описать логику взаимодействия человека и домашнего питомца.
 * Добавить разных животных. Добавить разные методы взаимодействия питомца и человека.
 * Возможно добавить разных членов семьи? Нужно использовать абстрактные классы и интерфейсы.
 *
 * Сценарий: Человек “зовёт” котика “кис-кис”, котик отзывается.
 */

public class App {
    public static void main(String[] args) {

        Man dima = new Boy("Dima", 36);// создаем мальчика Диму
        Man anna = new Girl("Anna", 30);// создаем девочку Анну
        Animal cat1 = new Cat(); // создаем кота
        Animal dog1 = new Dog(); //создаем собаку
        dima.call(cat1, Commands.KISKIS); //Дима зовет кота и собаку и они реагируют по разному
        dima.call(dog1, Commands.COME);
        dima.call(dog1,Commands.EAT);
        dima.call(dog1,Commands.EAT);
        System.out.println("----------");
        anna.call(cat1, Commands.COME);
        anna.call(dog1, Commands.KISKIS);


    }
}
