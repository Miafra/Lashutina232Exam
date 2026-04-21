public class UtilityService {
    // КОМУН.УСЛ.
    private double rate; //тариф
    private String serviceName;
    private String unit;

    public UtilityService(double rate, String serviceName, String unit) {
        this.rate = rate;
        this.serviceName = serviceName;
        this.unit = unit;
    }

    public double getRate() {
        return rate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getUnit() {
        return unit;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
