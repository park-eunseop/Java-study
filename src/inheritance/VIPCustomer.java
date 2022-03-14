package inheritance;

/**
 * @see Customer
 */
public class VIPCustomer extends Customer{

    /***
     * 하위 클래스가 생성될 때는 상위 클래스의 생성자가 먼저 호출된다.
     */
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super();// 컴파일러가 자동으로 추가하는 코드, 상위 클래스의 생성자가 호출된다.
        //super 기본 default는 noargs 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIP 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIP 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }


    public String showVIPInfo(){
        return super.showCustomerInfo();
    }

    @Override
    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
