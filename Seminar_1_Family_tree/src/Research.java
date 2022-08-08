import java.util.List;

public class Research {
  /*Метод вывода списка всех детей человека*/
    public static void printAllChildren( String name, String surname, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el : links){
            if (el.getPersonFirst().getName().equals(name) & el.getPersonFirst().getSurname().equals(surname) && el.getLink() == Relation.Parent) {
                System.out.println(el.getPersonSecond());
            }
        }
    }
/*метод выводит мужа или жену*/
    public static void printWifeOrHusband(String name, String surname, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el : links){
            if (el.getPersonFirst().getName().equals(name) && el.getPersonFirst().getSurname().equals(surname) && el.getLink() == Relation.Wife | el.getLink() == Relation.Husband)
                System.out.println(el.getPersonSecond());
        }
    }

    public static void findBrothersAndSisters(String name, String surname, Tree tree){
        List<Link> links = tree.getLinks();
        for (Link el: links){
            if(el.getPersonFirst().getName().equals(name) && el.getPersonFirst().getSurname().equals(surname) && el.getLink() == Relation.Child){
                Object parent = el.getPersonSecond();
                System.out.println(parent);
            }
        }
//        for (Link el: links){
//
//        }
    }
}
