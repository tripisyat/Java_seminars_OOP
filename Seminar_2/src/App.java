public class App {
    public static void main (String[] args){
        Cat barsic = new Cat("Barsic", "grey");
        Dog muhtar = new Dog("Muhtar", "brown");

        People Ivan = new People("Ivan", "Ivanov");
        Ivan.getCat(barsic);
        Ivan.caresDog(muhtar);

    }
}
