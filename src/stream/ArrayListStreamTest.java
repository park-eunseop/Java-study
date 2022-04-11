package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));
        /**
         * 한번 생성하고 사용한 스트림은 재사용 할 수 없다.
         * 스트림의 연산은 기존 자료를 변경하지 않는다.
         * 스트림의 연산은 중ㄷ간 연산과 최종 연산이 있다.
         */
    }
}
