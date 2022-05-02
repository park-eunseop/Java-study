package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws
            FileNotFoundException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }


    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        /*
        만약 메서드가 다른 여러 코드에서 호출되어 사용된다면 호출하는 코드의 상황에 맞게
        로그를 남기거나 예외 처리를 하는 것이 좋다. 따라서 이런 경우에는 메서드를 호출하는 부분에서
        예외  처리를 하도록 미루는 것이 합리적이다.
         */

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        Exception 클래스는 모든 예외 클래스의 최상위 클래스입니다.
        그래서 Exception 클래스를 맨 위에 사용하면 밑에 도달할 오류가 없어서 오류가 발생
        예외 처리 블록의 가장 아래에 놓여야 한다.
         */

    }
}
