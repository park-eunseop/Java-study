package string;

public class StringTest1 {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc"); //서로 다른 힙메모리

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(System.identityHashCode(str3));  // 같은 상수 풀에 저장되어 있으므로 가리키는 주소 값이 같다.
        System.out.println(System.identityHashCode(str4));

    }
}
