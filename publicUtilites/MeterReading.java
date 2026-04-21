import java.time.LocalDate;

public class MeterReading {
    private String serviceName;
    private double currentValue;
    private double previousValue;
    private LocalDate date;

    public MeterReading(String serviceName, double currentValue, double previousValue) {
        this.serviceName = serviceName;
        this.currentValue = currentValue;
        this.previousValue = previousValue;
        this.date = LocalDate.now();
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getPreviousValue() {
        return previousValue;
    }

    public LocalDate getDate() {
        return date;
    }

    // расход
    public double getConsumption() {
        return currentValue - previousValue;
    }

    public void showInfo() {
        System.out.println(serviceName + ": " + previousValue + " - " + currentValue + " = " + getConsumption() + " " + getServiceName());
        System.out.println("  Дата: " + date);
    }

}
