// Represents a device assigned to a patient
public class WearableDevice {
    private String deviceId;
    private String status;

    public WearableDevice(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() { return deviceId; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return deviceId + " - " + status;
    }
}
