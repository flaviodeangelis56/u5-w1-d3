package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTests {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);

    @Test
    public void priceTest() {
        Order order = (Order) ctx.getBean("getOrder1");
        double totalPrice = 0 + (order.getCostoCoperto() * order.getNumberOfGuests());
        double expectedPrice = 3 * order.getNumberOfGuests();
        assertEquals(expectedPrice, totalPrice);
    }


    @Test
    public void notMore6() {
        Order order = (Order) ctx.getBean("getOrder1");
        boolean moreOf6 = 6 >= order.getNumberOfGuests();
        assertTrue(moreOf6);
    }
}
