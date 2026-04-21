import java.time.YearMonth;

public class Invoice {
    private String number;
    private int apartmentNumber;
    private double amount;
    private boolean isPaid;
    private YearMonth period;

    public Invoice(String number, int apartmentNumber, double amount, YearMonth period) {
        this.number = number;
        this.apartmentNumber = apartmentNumber;
        this.amount = amount;
        this.isPaid = false;
        this.period = period;
    }

    public String getNumber() {
        return number;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public YearMonth getPeriod() {
        return period;
    }

    public void pay() {
        this.isPaid = true;
        System.out.println("Квитанция " + number + " оплачена");
    }

    public void showInfo() {
        System.out.println("квитанция №" + number);
        System.out.println("квартира №" + apartmentNumber);
        System.out.println("период: " + period);
        System.out.println("сумма: " + amount + " руб");
        System.out.println("статус: " + (isPaid ? "оплачено" : "не оплачено"));
    }
}

