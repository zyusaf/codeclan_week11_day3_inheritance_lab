import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Alan Sugar", "76 34 90 JZ 6", 24000.89, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Alan Sugar", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("76 34 90 JZ 6", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000.89, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(0.11);
        assertEquals(24001.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        manager.payBonus();
        assertEquals(240.00, manager.payBonus(), 0.01);
    }

    @Test
    public void negativeSalaryIncrease(){
        manager.raiseSalary(-1);
        assertEquals(24000.89, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Alan Sucre");
        assertEquals("Alan Sucre", manager.getName());
    }

    @Test
    public void ignoreNullName(){
        manager.setName(null);
        assertEquals("Alan Sugar", manager.getName());
    }

}
