package classex;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person = new Person();

        Class aClass = Class.forName("classex.Person");
        //aClass.newInstance()
        // Deprecated method

    }
}
