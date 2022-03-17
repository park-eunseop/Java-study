package interfaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;
    /*
    인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
     */

    int add(int num1, int num2);
    int substract(int num1,int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num1);
    /*
    인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
     */


    /**
     * 인터페이스는 클라이언트 프로그램에 어떤 메서드를 제공하는지 미리 알려주는 명세 또는 약속의 역할
     *
     * 디폴트 메서드 : 기본으로 제공되는 메서드, default 예약어 사용
     */
    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    /**
     * 정적 static 메서드
     * 클래스 생성과 무관하게 사용할 수 있다.
     * 사용할 때는 인터페이스 이름으로 직접 참조하여 사용
     */
    static int total(int[] arr){
        int total = 0;
        for (int i : arr) {
            total+= i;
        }
        myStaticMethod();
        return total;
    }

    /**
     * 자바 9부터 인터페이스에 private 메서드를 구현할 수 있다.
     * 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우에 재사용성을 높인다.
     * aws 메서드들은 private 메서드로 구현하면 좋네
     */
    private void myMethod(){
        System.out.println("private Method 입니다.");

    }
    private static void myStaticMethod(){
        System.out.println("private static Method 입니다.");
    }


}
