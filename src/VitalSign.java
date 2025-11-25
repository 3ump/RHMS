// Stores one set of vital readings
public class VitalSign {
    public int heartRate;
    public int bloodPressure;
    public double temperature;
    public String time;

    public VitalSign(int heartRate, int bloodPressure, double temperature, String time) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.time = time;
    }

    @Override
    public String toString() {
        return "HR: " + heartRate + ", BP: " + bloodPressure +
                ", Temp: " + temperature + ", Time: " + time;
    }
}
