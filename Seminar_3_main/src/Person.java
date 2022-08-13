public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
/*
*Переопределяем стандартный метод Java compareTo (сравнение)
* в данном случае мы будем сравнивать возраст какого то, к примеру, человека с возрастом конкретно этого экземпляра человека
 */
    @Override
    public int compareTo(Person o) {
        return o.age - this.age;
    }
}
