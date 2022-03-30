package hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add(new String("박은섭"));
        hashSet.add(new String("박유경"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("이순신"));// 중복된 값은 추가되지 않는다.8716


        System.out.println(hashSet);
        
    }
}
