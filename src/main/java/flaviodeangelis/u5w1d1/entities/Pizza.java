package flaviodeangelis.u5w1d1.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Pizza extends MenùItem {
    private String pizzaName;
    private List<Topping> ingredients;
    private int calories;
    private double price;
}
