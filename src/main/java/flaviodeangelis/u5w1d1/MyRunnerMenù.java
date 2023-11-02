package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Menù;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Slf4j
public class MyRunnerMenù implements CommandLineRunner {
    @Autowired
    Menù menù;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----------------------------------------MENU--------------------------------------------");
        System.out.println("PIZZE");
        menù.getPizzas().forEach(System.out::println);
        System.out.println("INGREDIENTI");
        menù.getToppings().forEach(System.out::println);
        System.out.println("BEVANDE");
        menù.getDrinks().forEach(System.out::println);
    }
}
