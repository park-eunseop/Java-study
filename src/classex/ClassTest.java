package classex;

public class ClassTest {

    public static void main(String[] args) {
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println(aClass.getName());
        Class bClass = Person.class;
    }
}
