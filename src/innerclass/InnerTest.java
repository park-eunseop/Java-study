package innerclass;

class OutClass {  //외부 클래스
    
    private int num = 10;  // 외부 클래스 private 변수
    private static int sNum = 20; // 외부 클래스 정적 변수
    
    private InClass inClass;
    
    public OutClass() {
        inClass = new InClass();
    }

    public void usingClass() {
        inClass.usingClass();
    }

    class InClass {// 인스턴스 내부 클래스
        int inNum = 100; // 내부 클래스의 인스턴스 변수

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

        //정적 메서드 정의 불가능(내부클래스의 메서드가 외부클래스보다 먼저 호출될수는 없으니깐)

        public void usingClass() {
            inClass.inTest();
        }
    }

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            //정적 내부 클래스에서 외부 인스턴스 변수를 사용할 수 없다.
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest() {
            System.out.println(sNum);
            System.out.println(sInNum);
        }
    }

}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();


        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutClass.InStaticClass.sTest();
    }
}
