package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Pizza;
import flaviodeangelis.u5w1d1.entities.Topping;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTests {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);

    @Test
    @Disabled
    public void testMargheritaToppings() {
        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        Pizza margherita = (Pizza) ctx.getBean("getMargherita");
        assertEquals(margherita.getIngredients().get(0), mozzarella);
        assertEquals(margherita.getIngredients().get(1), pomodoro);
    }

    @Test
    @Disabled
    public void testDiavolaToppings() {

        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        Topping salamePiccante = new Topping("salame piccante", 369, 1.50);
        Pizza diavola = (Pizza) ctx.getBean("getDiavola");
        assertEquals(diavola.getIngredients().get(0), mozzarella);
        assertEquals(diavola.getIngredients().get(1), pomodoro);
        assertEquals(diavola.getIngredients().get(2), salamePiccante);
    }

    @Test
    public void priceMargheritaTest() {
        Pizza margherita = (Pizza) ctx.getBean("getMargherita");
        assertEquals(5.50, margherita.getPrice());
    }

    @Test
    public void priceDiavolaTest() {
        Pizza diavola = (Pizza) ctx.getBean("getDiavola");
        assertEquals(7.00, diavola.getPrice());
    }
}
