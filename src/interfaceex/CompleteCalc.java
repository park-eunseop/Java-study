package interfaceex;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {

        if(num2 !=0){
            return num1/num2;
        }
        else
            return Calc.ERROR;

    }

    @Override
    public int square(int num1) {
        return num1*num1;
    }

    public void showInfo(){
        System.out.println("Cal 인터페이스를 구현하였습니다.");
    }

    @Override
    public void description() {
        super.description();// 부모 디폴트 메서드를 사용하지 않을꺼면 super 지우면 된다.
    }
}
