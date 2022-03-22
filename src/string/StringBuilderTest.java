package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println(System.identityHashCode(javaStr));

        StringBuilder stringBuilder = new StringBuilder(javaStr);
        System.out.println(System.identityHashCode(stringBuilder));

        stringBuilder.append(" and");
        stringBuilder.append(" android");
        System.out.println(stringBuilder.toString());
        System.out.println(System.identityHashCode(stringBuilder));


        /**
         * String Buffer 는 멀티 스레드가 동시에 문자열을 변경하려 할때 문자열이 안전하게 변경되도록 보장
         * String Builder 는 보장하지 않는다. 하지만 실행 속도가 빠르다.
         */


        StringBuffer stringBuffer = new StringBuffer(javaStr);
        System.out.println(System.identityHashCode(stringBuffer));
        stringBuffer.append(" and");
        stringBuffer.append(" android");
        System.out.println(stringBuffer.toString());
        System.out.println(System.identityHashCode(stringBuffer));


    }
}
