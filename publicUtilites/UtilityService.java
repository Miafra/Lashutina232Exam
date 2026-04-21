public class UtilityService {
    private String name;
    private double rate;
    private String unit;

    public UtilityService(String name, double rate, String unit) {
        this.name = name;
        this.rate = rate;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // стоимость услуги
    public double calculateCost(double consumption) {
        return consumption * rate;
    }

    // информация
    public void showInfo() {
        System.out.println(name + " - " + rate + " руб/" + unit);
    }
}
