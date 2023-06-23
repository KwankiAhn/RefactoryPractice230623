public class DeviceTest {
	private DeviceType deviceType = new NormalDeviceType();

	public DeviceTest(int typeCode) {
		setDeviceType(typeCode);
	}
	public void setDeviceType(int deviceType) {
		this.deviceType = this.deviceType.newDevice(deviceType);
	}
	public int getDeviceType() {
		return this.deviceType.getDeviceType();
	}
	public void test(String command) {
		deviceType.test(command);
	}
}
