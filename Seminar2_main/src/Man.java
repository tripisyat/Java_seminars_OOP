/*
* Описываем модель человека*/



/**
 * Делаем класс Man имплиментивным к интерфейсу Action,
 * автоматически будет предложено реализовать методы через @Override, которые конкретно не описаны в Action
 */
public abstract class Man implements Action {
    protected String name;
    protected  int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
