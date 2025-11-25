// This class stores basic patient information
public class Patient {
    private String patientId;
    private String name;
    private int age;
    private WearableDevice device;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public WearableDevice getDevice() { return device; }
    public void setDevice(WearableDevice device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return patientId + " - " + name + " (Age: " + age + ")";
    }
}
