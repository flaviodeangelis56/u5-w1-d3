package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@org.springframework.core.annotation.Order(2)
public class MyRunnerOrder implements CommandLineRunner {


    public void totalPriceFunction() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Order order = (Order) ctx.getBean("getOrder1");
        double totalPrice = 0 + (order.getCostoCoperto() * order.getNumberOfGuests());
        for (int i = 0; i < order.getOrderItems().size(); i++) {
            totalPrice += order.getOrderItems().get(i).getPrice();
        }
        System.out.println("total price is :" + totalPrice + "$");
        ctx.close();
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------ORDINE--------------------------------------------");
        Order order = (Order) ctx.getBean("getOrder1");
        order.getOrderItems().forEach(System.out::println);
        totalPriceFunction();
    }
}
