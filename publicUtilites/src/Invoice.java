import java.util.Date;

public class Invoice {
    private int periodStart;
    private int periodEnd;
    private int dueDate;
    private double totalAmount;
    private boolean isPaid;
    private int invoiceNumber;

    public Invoice(int periodStart, int periodEnd, int dueDate, double totalAmount, boolean isPaid) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.dueDate = dueDate;
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
    }

    public int getPeriodStart() {
        return periodStart;
    }

    public int getPeriodEnd() {
        return periodEnd;
    }

    public int getDueDate() {
        return dueDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void pay() {
        if (isPaid == true) {
            System.out.println("Квитанция уже оплачена");
        } else {
            this.isPaid = true;
            System.out.println("квитанция" + invoiceNumber + "оплачена");
        }
    }

    public void showInfo() {
        System.out.println("квитанция № " + invoiceNumber);
        System.out.println("Период: с " + periodStart + " до " + periodEnd);
        System.out.println("Срок оплаты: " + dueDate);
        System.out.println("Итоговая сумма: " + totalAmount);
        System.out.println("Статус: " + isPaid);
    }
}
