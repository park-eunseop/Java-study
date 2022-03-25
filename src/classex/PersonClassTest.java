package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("classex.Person");
        Constructor[] constructors = aClass.getConstructors();

        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println();

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
