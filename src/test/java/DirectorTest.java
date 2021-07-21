import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Sandy", "DONT TRUST THE IDE", 3.30, "Software", 50000.48);
    }

    @Test
    public void hasName(){
        assertEquals("Sandy", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("DONT TRUST THE IDE", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(3.30, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Software", director.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(0.11);
        assertEquals(3.41, director.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        director.payBonus();
        assertEquals(0.06, director.payBonus(), 0.01);
    }
}
