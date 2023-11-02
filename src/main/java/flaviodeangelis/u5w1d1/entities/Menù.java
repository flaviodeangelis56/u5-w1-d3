package flaviodeangelis.u5w1d1.entities;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("menu_component")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Menù {
    @Autowired
    private List<Pizza> pizzas;
    @Autowired
    private List<Topping> toppings;
    @Autowired
    private List<Drink> drinks;


//    @Override
//    public void run(String... args) throws Exception {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
//        Menù menù = (Menù) ctx.getBean("getMenù");
//        System.out.println("PIZZE");
//        menù.getPizzas().forEach(System.out::println);
//        System.out.println("INGREDIENTI");
//        menù.getToppings().forEach(System.out::println);
//        System.out.println("BEVANDE");
//        menù.getDrinks().forEach(System.out::println);
//        ctx.close();
//    }
}
