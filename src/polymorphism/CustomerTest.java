package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        Customer customerLee = new Customer(10010, "Lee");
        Customer customerShin = new Customer(10020, "Shine");
        Customer customerHong = new GoldCustomer(10030, "Hong");
        Customer customerPark = new GoldCustomer(10040, "Park");
        Customer custoemrKim = new VIPCustomer(10050, "Kim", 12345);

        customerArrayList.add(customerLee);
        customerArrayList.add(customerHong);
        customerArrayList.add(customerPark);
        customerArrayList.add(custoemrKim);
        customerArrayList.add(customerShin);

        System.out.println("=====informations of Client");
        for (Customer customer : customerArrayList) {
            System.out.println(customer.showCustomerInfo());

        }
        System.out.println("====ratio and bonus point");
        int price = 10000;
        for (Customer customer : customerArrayList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + " 원 지불하셨습니다.");
            System.out.println(customer.getCustomerName()+ "님의 현재 보너스 포인트는"
            + customer.bonusPoint +"점 입니다.");
        }

    }
}
