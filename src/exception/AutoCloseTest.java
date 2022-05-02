package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        /*
        try-with-resource 문을 사용할 때 try 문의 괄호 안에 리소스를 선언합니다.
        리소스를 여러 개 생성해야 한다면 세미 콜론으로 구분합니다.
         */
        try(AutoCloseObj obj = new AutoCloseObj()){
            throw new Exception();
        }catch (Exception e){
            System.out.println("예외 부분입니다.");
        }

        /*
        java 9에서 추가, 외부에서 선언한 변수를 리소스로 쓸 수 있다.
         */
        AutoCloseObj obj = new AutoCloseObj();
        try (obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("외부에서 선언한 변수 리소스 예외입니다.");
        }
    }
}
