package flaviodeangelis.u5w1d1;

import flaviodeangelis.u5w1d1.entities.Table;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableTests {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);


    @Test
    public void equalsPersonTableOrder() {
        Table table = (Table) ctx.getBean("getTable1");
        assertEquals(6, table.getMaxGuests());
    }
}
