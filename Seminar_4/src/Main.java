public class Main {
    public static void main(String[] args) {
        PlusList<Integer> list = new PlusList(3);
        list.add(1);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.add(7);
        System.out.println(list);

        System.out.println(list.getByIndex(2));

//        list.removeByIndex(0);
//        System.out.println(list);

        list.removeByElement(5);
        System.out.println(list);

    }
}
