// Simple alert class used when vitals are abnormal
public class Alert {
    public String alertId;
    public String message;
    public String severity;

    public Alert(String alertId, String message, String severity) {
        this.alertId = alertId;
        this.message = message;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "[" + severity + "] " + message;
    }
}
