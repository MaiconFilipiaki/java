package Program;

import entities.Order;
import enums.OrderStatus;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DEVILERED;

        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");
        System.out.println(os1);
        System.out.println(os2);
    }

}
