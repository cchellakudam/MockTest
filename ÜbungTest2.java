import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;
public class �bungTest2 {

	@Test
	public void test() {
	�bung1 u = mock(�bung1.class);
	when(u.add(4, 5)).thenReturn(9);
	assertEquals(9,u.add(4, 5));
	}

}
