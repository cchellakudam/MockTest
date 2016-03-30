import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;
public class ÜbungTest2 {

	@Test
	public void test() {
	Übung1 u = mock(Übung1.class);
	when(u.add(4, 5)).thenReturn(9);
	assertEquals(9,u.add(4, 5));
	}

}
