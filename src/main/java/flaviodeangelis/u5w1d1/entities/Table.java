package flaviodeangelis.u5w1d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Table {
    private int tableNumber;
    private int maxGuests;
    private boolean isOccupied;


}
