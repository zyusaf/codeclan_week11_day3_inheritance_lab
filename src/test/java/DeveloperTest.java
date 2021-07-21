import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steve Woz", "APPLE1", 300000.14);
    }

    @Test
    public void hasName(){
        assertEquals("Steve Woz", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("APPLE1", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(300000.14, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(0.11);
        assertEquals(300000.25, developer.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        developer.payBonus();
        assertEquals(3000.00, developer.payBonus(), 0.01);
    }
}
