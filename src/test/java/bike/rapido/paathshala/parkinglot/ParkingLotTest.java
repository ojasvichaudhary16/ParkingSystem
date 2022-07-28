package bike.rapido.paathshala.parkinglot;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import static org.junit.Assert.assertEquals;

public class ParkingLotTest {
    private  ParkingManagement parkingManagement;
    @Before
    public void setUp() {
        parkingManagement=new ParkingManagement();
    }

    @Test
    public void shouldAllowFirstCarParking() {

        String result=parkingManagement.canPark();

        assertEquals("You Can Park", result);
    }

    @Test
    public void shouldAllowSecondCarParking() {

        String result=parkingManagement.canPark();

        assertEquals("You Can Park", result);
    }

    @Test
    public void shouldAllowThirdCarParking() {

        String result=parkingManagement.canPark();

        assertEquals("You Can Park", result);
    }

    @Test
    public void shouldAllowForthCarParking() {

        String result=parkingManagement.canPark();

        assertEquals("You Can Park", result);
    }

    @Test
    public void shouldNotAllowFifthCarParking() {

        String result=parkingManagement.canPark();

        assertEquals("Parking Full", result);
    }




}
