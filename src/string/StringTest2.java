package string;

public class StringTest2 {

    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");

        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr));
        System.out.println(androidStr);
        System.out.println(System.identityHashCode(androidStr));


        javaStr = javaStr.concat(androidStr);

        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr)); //새로운 문자열 생성
    }

}
