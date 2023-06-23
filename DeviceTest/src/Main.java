public class Main {

	public static void main(String[] args) {
		DeviceTest device1 = new DeviceTest(DeviceType.AdvancedType);
		device1.test("Booting");

		DeviceTest device2 = new DeviceTest(DeviceType.NormalType);
		device2.test("Booting");

		DeviceTest device3 = new DeviceTest(DeviceType.EntryType);
		device3.test("Booting");
	}
}
