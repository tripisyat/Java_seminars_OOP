/**
 * Создаем мальчика, наследуется от абстрактного класса Man
 */

public class Boy extends Man {

    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal, Commands commands) {
        if (animal instanceof Cat) {
            System.out.printf("Boy say %s to cat\n", commands);
            switch (commands) {
                case KISKIS -> animal.goodAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }

        } else if (animal instanceof Dog) {
            System.out.printf("Boy say %s to dog\n", commands);
            switch (commands) {
                case KISKIS -> animal.badAnswer();
                case COME -> animal.come();
                case EAT -> {
                    animal.eat();
                }
            }
        }
    }
}