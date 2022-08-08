public class People extends Human implements Human_action{

    public People(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void getCat(Cat Barsic) {
        Barsic.Myau();
        }
    @Override
    public void caresDog(Dog Muhtar) {
        Muhtar.gaf();
    }

    }