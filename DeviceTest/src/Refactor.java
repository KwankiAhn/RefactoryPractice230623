import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Refactor {
	@Test
	void test() {
		ByteArrayOutputStream testOut = new ByteArrayOutputStream();
		PrintStream stdOut = System.out;
		System.setOut(new PrintStream(testOut));

		DeviceTest device1 = new DeviceTest(DeviceType.AdvancedType);
		device1.test("Booting");
		assertEquals("Advanced Type Device Testing Command: Booting\n", 
				testOut.toString());
		testOut.reset();
		DeviceTest device2 = new DeviceTest(DeviceType.NormalType);
		device2.test("Booting");
		assertEquals("Normal Type Device Testing Command: Booting\n", 
				testOut.toString());
		testOut.reset();
		DeviceTest device3 = new DeviceTest(DeviceType.EntryType);
		device3.test("Booting");
		assertEquals("Entry Type Device Testing Command: Booting\n", 
				testOut.toString());		
        System.setOut(stdOut);
	}

}
