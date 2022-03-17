package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy(); // Buy 인터페이스 메서드만 호출할 수 있어

        Sell seller = customer;
        seller.sell(); // Sell 인터페이스 메서드만 호출할 수 있어

        System.out.println(seller instanceof Customer);  //true
        Customer customer1 = (Customer) seller;
        customer1.buy();
        customer1.sell();
    }
}
