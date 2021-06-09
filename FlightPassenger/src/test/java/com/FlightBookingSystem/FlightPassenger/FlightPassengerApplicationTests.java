package com.FlightBookingSystem.FlightPassenger;

import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.FlightBookingSystem.FlightPassenger.model.Passenger;

import ch.qos.logback.core.Context;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class FlightPassengerApplicationTests {

	 private static final String FAKE_STRING = "Login was successful";

	    @Mock
	    Context mMockContext;
	    
	@Test
	void contextLoads() {

		
		
	}
      /*  Passenger myObjectUnderTest = new Passenger();

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("user","user");

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

	private Object is(String fakeString) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

}
