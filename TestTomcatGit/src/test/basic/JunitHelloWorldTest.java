package basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitHelloWorldTest {

	@Test
	public void testHelloWorld() {
		Junit test = new Junit();
		assertEquals("Hello World",test.helloWorld());
	}

}
