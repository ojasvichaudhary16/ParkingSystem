package bike.rapido.paathshala.parkinglot;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import static org.junit.Assert.assertEquals;

public class ParkingLotTest {
    private  ParkingManagement parkingManagement;

    @Before
    public void setUp() {
          parkingManagement = new ParkingManagement();
    }

    @Test
    public void shouldAllowFirstCarParking() {

        String status= parkingManagement.park();

        assertEquals("You Can Park", status);
    }

    @Test
    public void shouldAllowSecondCarParking() {

        String status=parkingManagement.park();

        assertEquals("You Can Park", status);
    }

    @Test
    public void shouldAllowThirdCarParking() {

        String status=parkingManagement.park();

        assertEquals("You Can Park", status);
    }

    @Test
    public void shouldAllowFourthCarParking() {

        String status=parkingManagement.park();

        assertEquals("You Can Park", status);
    }

    @Test
    public void shouldNotAllowFifthCarParking() {
        String status=parkingManagement.park();

        assertEquals("Parking Full", status);
    }

    @Test
    public void shouldAllowFirstDepart(){
        String status = parkingManagement.depart();

        assertEquals("Car Departed", status);

    }

    @Test
    public void shouldAllowSecondDepart(){
        String status = parkingManagement.depart();
        
        assertEquals("Car Departed", status);
        
    }

    @Test
    public void shouldAllowThirdDepart() {
        String status = parkingManagement.depart();

        assertEquals("Car Departed", status);
    }

    @Test
    public void shouldAllowFourthDepart() {
        String status = parkingManagement.depart();

        assertEquals("Car Departed", status);
    }

    @Test
    public void shouldNotAllowFifthDepart() {
        String status = parkingManagement.depart();

        assertEquals("Parking Empty", status);
    }


}
