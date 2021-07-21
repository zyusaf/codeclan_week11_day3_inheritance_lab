import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void before(){
        databaseadmin = new DatabaseAdmin("Jon", "DB45", 1000000.65);
    }

    @Test
    public void hasName(){
        assertEquals("Jon", databaseadmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("DB45", databaseadmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000000.65, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        databaseadmin.raiseSalary(0.11);
        assertEquals(1000000.76, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        databaseadmin.payBonus();
        assertEquals(10000.00, databaseadmin.payBonus(), 0.01);
    }
}
