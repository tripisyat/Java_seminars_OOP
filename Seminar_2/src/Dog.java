public class Dog extends Animal implements Dog_action{
    public Dog(String name, String color) {//конструктор
        super(name, color); //наследует от Animal
    }

    public void gaf(){
        System.out.println("Gav");
    }
    public void animalSleep(){
        System.out.println("Zzzzzzzzz");
    }
}
