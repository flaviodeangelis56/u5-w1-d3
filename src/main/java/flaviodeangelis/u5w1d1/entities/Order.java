package flaviodeangelis.u5w1d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@ToString
@Getter
@Setter
public class Order {
    private int orderNumber;
    private String status;
    private int numberOfGuests;
    private LocalDateTime orderTime;
    private List<MenùItem> orderItems;
    private double costoCoperto;
}
