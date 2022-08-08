public class Cat extends Animal implements Cat_action{

    public void Myau() {
        System.out.println("miau");
    }

    public Cat(String name, String color) {//конструктор кота
        super(name, color);
    }


    public void animalSleep(){
        System.out.println("Zzzzzzzzz");
    }
}
