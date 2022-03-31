package treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();  //문자열은 숫자, 영어, 한글 순으로 아스키 코드 순으로 정렬하는구나
        treeSet.add("홍길동");
        treeSet.add("apple");
        treeSet.add("박은섭");
        treeSet.add("124");
        treeSet.add("이순신");
        treeSet.add("444");
        treeSet.add("banana");
        for (String s : treeSet) {
            System.out.println(s);
        }

    }
}
