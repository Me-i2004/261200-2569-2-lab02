
public class Lab02 {
    public static void main(String[] args) {

        // Create AirPurifier objects
        AirPurifier a1 =
                new AirPurifier("Xiaomi Pro", "K69");

        AirPurifier a2 =
                new AirPurifier("Xiaomi Pro", "K70");

        AirPurifier a3 =
                new AirPurifier("Xiaomi Lite", "K71");

        // Test turnOn()
        System.out.println("===== TURN ON =====");
        a1.turnOn();
        a2.turnOn();

        // Test isOn()
        System.out.println("\n===== CHECK POWER =====");
        System.out.println("A1 is on: " + a1.isOn());
        System.out.println("A2 is on: " + a2.isOn());
        System.out.println("A3 is on: " + a3.isOn());

        // Test increaseFanSpeed()
        System.out.println("\n===== INCREASE FAN SPEED =====");
        a1.increaseFanSpeed();
        a1.increaseFanSpeed();
        a1.increaseFanSpeed();

        // Test decreaseFanSpeed()
        System.out.println("\n===== DECREASE FAN SPEED =====");
        a1.decreaseFanSpeed();

        // Test getFanSpeed()
        System.out.println("\n===== GET FAN SPEED =====");
        System.out.println("A1 Fan Speed: "
                + a1.getFanSpeed() + "%");

        // Test turnOff()
        System.out.println("\n===== TURN OFF =====");
        a1.turnOff();

        // Test decreaseFanSpeed when machine is OFF
        System.out.println("\n===== TEST WHEN OFF =====");
        a1.decreaseFanSpeed();

        // Test displayInfo()
        System.out.println("\n===== DISPLAY INFO =====");
        a1.displayInfo();
        a2.displayInfo();
        a3.displayInfo();

        // Test getModel() and getSerialNo()
        System.out.println("\n===== GET INFORMATION =====");
        System.out.println("Model: " + a1.getModel());
        System.out.println("Serial No: " + a1.getSerialNo());

        // Test Class Methods
        System.out.println("\n===== CLASS METHODS =====");

        System.out.println("Total Purifiers: "
                + AirPurifier.getTotalPurifiers());

        System.out.println("Number of Models: "
                + AirPurifier.getNumberOfModels());

        System.out.println("Xiaomi Pro Count: "
                + AirPurifier.getCountForModel("Xiaomi Pro"));

        System.out.println("Xiaomi Lite Count: "
                + AirPurifier.getCountForModel("Xiaomi Lite"));

        System.out.println("Most Popular Model: "
                + AirPurifier.getMostPopularModel());

        System.out.println("Average Count Per Model: "
                + AirPurifier.getAverageCountPerModel());
    }
}
