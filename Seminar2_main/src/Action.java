/**
 *  В interface выносим все действия,
 *  в данном случае выносим действия, которые будет делать человек
 *  В скобках указываем животное, так как с ним будет взаимодействие
 */
public interface Action {
    void call(Animal animal, Commands command);

}
