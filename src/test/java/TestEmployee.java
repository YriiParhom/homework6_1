import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmployee {

    @Test
    public void testGetId(){
        Employee employee = new Employee();
        employee.setId(12);

        assertEquals(12, employee.getId());
    }

    @Test
    public void testGetFirstName(){
        Employee employee = new Employee();
        employee.setFirstName("Max");

        assertEquals("Max", employee.getFirstName());
    }

    @Test
    public void testSetLastName(){
        Employee employee = new Employee();
        employee.setLastName("Voronov");

        assertEquals("Voronov", employee.lastName);
    }
}
