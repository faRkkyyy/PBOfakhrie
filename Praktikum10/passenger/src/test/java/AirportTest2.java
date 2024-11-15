
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.example.Flight;
import com.example.Passenger;

public class AirportTest2 {

    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new Flight("1", "Economy");
        }

        @DisplayName("Given there is a business flight")
        @Nested
        class BusinessFlightTest {

            private Flight businessFlight;

            @BeforeEach
            void setUp() {
                businessFlight = new Flight("2", "Business");
            }

            @Test
            public void testBusinessFlightRegularPassenger() {
                Passenger mike = new Passenger("Mike", false);
                assertEquals(false, businessFlight.addPassenger(mike));
                assertEquals(0, businessFlight.getPassengersList().size());
                assertEquals(false, businessFlight.removePassenger(mike));
                assertEquals(0, businessFlight.getPassengersList().size());
            }

            @Test
            public void testBusinessFlightVipPassenger() {
                Passenger james = new Passenger("James", true);
                assertEquals(true, businessFlight.addPassenger(james));
                assertEquals(1, businessFlight.getPassengersList().size());
                assertEquals(false, businessFlight.removePassenger(james));
                assertEquals(1, businessFlight.getPassengersList().size());
            }
        }
    }
}
