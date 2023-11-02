package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {

    @Bean
    Pizza getMargherita() {
        List<Topping> ingredients = new ArrayList<>();
        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        ingredients.add(mozzarella);
        ingredients.add(pomodoro);
        return new Pizza("margherita", ingredients, 1104, 5.50);
    }

    @Bean
    Pizza getDiavola() {
        List<Topping> ingredients = new ArrayList<>();
        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        Topping salamePiccante = new Topping("salame piccante", 369, 1.50);
        ingredients.add(mozzarella);
        ingredients.add(pomodoro);
        ingredients.add(salamePiccante);
        return new Pizza("diavola", ingredients, 1264, 7.00);
    }

    @Bean
    Topping getPomodoro() {
        return new Topping("pomodoro", 150, 0.50);
    }

    @Bean
    Topping getMozzarella() {
        return new Topping("mozzarella", 230, 0.50);
    }

    @Bean
    Topping getSalamePiccante() {
        return new Topping("salame piccante", 369, 1.50);
    }

    @Bean
    Drink getAcqua() {
        return new Drink("Acqua", 37, 1.50);
    }

    @Bean
    Drink getCola() {
        return new Drink("Coca Cola", 211, 2.50);
    }


    @Bean
    Table getTable1() {
        return new Table(1, 4, true);
    }

    @Bean
    Order getOrder1(@Value("${costo.comperto}") double costoCoperto) {
        List<Topping> ingredients1 = new ArrayList<>();
        List<Topping> ingredients2 = new ArrayList<>();
        List<MenùItem> orderItem = new ArrayList<>();
        Topping mozzarella = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro = new Topping("pomodoro", 150, 0.50);
        ingredients1.add(mozzarella);
        ingredients1.add(pomodoro);
        Pizza marherita = new Pizza("margherita", ingredients1, 1104, 5.50);
        Topping mozzarella2 = new Topping("mozzarella", 230, 0.50);
        Topping pomodoro2 = new Topping("pomodoro", 150, 0.50);
        Topping salamePiccante = new Topping("salame piccante", 369, 1.50);
        ingredients2.add(mozzarella);
        ingredients2.add(pomodoro);
        ingredients2.add(salamePiccante);
        Pizza diavola = new Pizza("diavola", ingredients2, 1264, 7.00);
        orderItem.add(marherita);
        orderItem.add(diavola);
        Drink acqua = new Drink("Acqua", 37, 1.50);
        Drink cola = new Drink("Coca Cola", 211, 2.50);
        orderItem.add(acqua);
        orderItem.add(cola);
        return new Order(1, "in corso", 3, LocalDateTime.now(), orderItem, costoCoperto);
    }
}
