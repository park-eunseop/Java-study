package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("Lee", 40, 100);
        TravelCustomer customerPark = new TravelCustomer("Park", 30, 200);
        TravelCustomer customerHong = new TravelCustomer("Hong", 20, 500);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerPark);
        customerList.add(customerHong);

        System.out.println("고객 명단 추가된 순서대로 출력");

        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 비용은 " + total);

        System.out.println("20세 이상 고객 명단 정렬하여 출력");
        customerList.stream().filter(c->c.getAge()>20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
    }
}
