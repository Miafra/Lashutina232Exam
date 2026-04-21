import java.util.ArrayList;

public class Service {
    private ArrayList<UtilityService> services;

    public Service() {
        services = new ArrayList<>();
        createDefaultServices();
    }

    private void createDefaultServices() {
        services.add(new UtilityService("Электричество", 5.50, "кВт/ч"));
        services.add(new UtilityService("Холодная вода", 35.00, "м³"));
        services.add(new UtilityService("Горячая вода", 45.00, "м³"));
        services.add(new UtilityService("Отопление", 25.00, "кв.м"));
        services.add(new UtilityService("Вывоз мусора", 150.00, "чел."));
    }

    // список услуг
    public ArrayList<UtilityService> getAllServices() {
        return services;
    }

}
