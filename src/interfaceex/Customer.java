package interfaceex;

/**
 * 여러 인터페이스의 구현 클래스생성
 */
public class Customer implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
        
    }

    @Override
    public void sell() {
        System.out.println("판매하기");

    }
}
