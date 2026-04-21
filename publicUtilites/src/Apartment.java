import java.util.ArrayList;

public class Apartment {
     private int apartmentNumber;
     private double totalArea;
     private int tenants;
     private String ownerName;
     private ArrayList<MeterReadings> meterReadings; // показания счетчиков
     private ArrayList<Payment> payment; // платежи

     public Apartment(int apartmentNumber, double totalArea, int tenants, String ownerName, ArrayList<MeterReadings> meterReadings, ArrayList<Payment> payment) {
          this.apartmentNumber = apartmentNumber;
          this.totalArea = totalArea;
          this.tenants = tenants;
          this.ownerName = ownerName;
          this.meterReadings = new ArrayList<>();
          this.payment = new ArrayList<>();
     }

     public int getApartmentNumber() {
          return apartmentNumber;
     }

     public double getTotalArea() {
          return totalArea;
     }

     public String getOwnerName() {
          return ownerName;
     }

     public ArrayList<MeterReadings> getMeterReadings() {
          return meterReadings;
     }

     public ArrayList<Payment> getPayment() {
          return payment;
     }

     public int getTenants() {
          return tenants;
     }

     public void setOwnerName(String ownerName) {
          this.ownerName = ownerName;
     }


}
