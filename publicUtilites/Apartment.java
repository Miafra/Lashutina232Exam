import java.util.ArrayList;

public class Apartment {
    private int number;
    private String owner;
    private double area;
    private int residents;
    private ArrayList<MeterReading> meterReadings;
    private ArrayList<Invoice> invoices;

    public Apartment(int number, String owner, double area, int residents) {
        this.number = number;
        this.owner = owner;
        this.area = area;
        this.residents = residents;
        this.meterReadings = new ArrayList<>();
        this.invoices = new ArrayList<>();
        addDefaultReadings();
    }

    private void addDefaultReadings() {
        // Добавляем показания для каждой услуги
        meterReadings.add(new MeterReading("Электричество", 350, 300));
        meterReadings.add(new MeterReading("Холодная вода", 45, 40));
        meterReadings.add(new MeterReading("Горячая вода", 32, 28));
        meterReadings.add(new MeterReading("Отопление", 2.5, 2.0));
    }


    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public double getArea() {
        return area;
    }

    public int getResidents() {
        return residents;
    }

    public ArrayList<MeterReading> getMeterReadings() {
        return meterReadings;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    public void showInfo() {
        System.out.println(" Квартира №" + number);
        System.out.println("  Владелец: " + owner);
        System.out.println("  Площадь: " + area + " кв.м");
        System.out.println("  Жильцов: " + residents);
        System.out.println("  Показаний: " + meterReadings.size());
        System.out.println("  Квитанций: " + invoices.size());
    }

}
