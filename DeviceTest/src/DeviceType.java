public abstract class DeviceType {
	public static final int EntryType = 0;
	public static final int NormalType = 1;
	public static final int AdvancedType = 2;

	public abstract int getDeviceType();

	DeviceType newDevice(int deviceType) {
		switch (deviceType) {
		case DeviceType.EntryType:
			return new EntryDeviceType();
		case DeviceType.NormalType:
			return new NormalDeviceType();
		case DeviceType.AdvancedType:
			return new AdvancedDeviceType();
		}
		return null;
	}

	protected abstract void test(String command);
}
