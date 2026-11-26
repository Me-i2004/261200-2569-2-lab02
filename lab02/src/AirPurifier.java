
import java.util.HashMap;

public class AirPurifier {

    // Instance Variables
    private String model;
    private String serialNo;
    private boolean power;
    private int fanSpeed;

    // Class Variables
    private static int totalPurifiers = 0;
    private static HashMap<String, Integer> modelCounts
            = new HashMap<>();

    // Constructor
    public AirPurifier(String model, String serialNo) {

        this.model = model;
        this.serialNo = serialNo;
        this.power = false;
        this.fanSpeed = 0;

        totalPurifiers++;

        modelCounts.put(
                model,
                modelCounts.getOrDefault(model, 0) + 1
        );
    }

    // Instance Methods
    // Turn on the air purifier
    public void turnOn() {

        if (power) {
            System.out.println(model + " is already ON.");
        } else {
            power = true;
            fanSpeed = 25;

            System.out.println(model + " is now ON.");
            System.out.println("Fan speed: " + fanSpeed + "%");
        }
    }

    // Turn off the air purifier
    public void turnOff() {

        if (power) {
            power = false;
            fanSpeed = 0;

            System.out.println(model + " is now OFF.");
        } else {
            System.out.println(model + " is already OFF.");
        }
    }

    // Check power status
    public boolean isOn() {
        return power;
    }

    // Increase fan speed by 25%
    public void increaseFanSpeed() {

        if (!power) {
            System.out.println("Please turn on the purifier first.");
        } else if (fanSpeed < 100) {

            fanSpeed += 25;

            System.out.println("Fan speed increased to "
                    + fanSpeed + "%.");

        } else {
            System.out.println("Fan speed is already at 100%.");
        }
    }

    // Decrease fan speed by 25%
    public void decreaseFanSpeed() {

        if (!power) {
            System.out.println("Please turn on the purifier first.");
            return;
        }

        fanSpeed -= 25;

        if (fanSpeed <= 0) {
            turnOff();
        } else {
            System.out.println("Fan speed decreased to "
                    + fanSpeed + "%.");
        }
    }

    // Get fan speed
    public int getFanSpeed() {
        return fanSpeed;
    }

    // Get model
    public String getModel() {
        return model;
    }

    // Get serial number
    public String getSerialNo() {
        return serialNo;
    }

    // Display air purifier information
    public void displayInfo() {

        System.out.println("-------------------------");
        System.out.println("Model: " + model);
        System.out.println("Serial No: " + serialNo);

        if (power) {
            System.out.println("Status: ON");
        } else {
            System.out.println("Status: OFF");
        }

        System.out.println("Fan Speed: " + fanSpeed + "%");
        System.out.println("-------------------------");
    }

    // Class Methods
    // Get total number of purifiers
    public static int getTotalPurifiers() {
        return totalPurifiers;
    }

    // Get number of purifiers for a model
    public static int getCountForModel(String model) {
        return modelCounts.getOrDefault(model, 0);
    }

    // Get number of different models
    public static int getNumberOfModels() {
        return modelCounts.size();
    }

    // Get the most popular model
    public static String getMostPopularModel() {

        String popularModel = null;
        int maxCount = 0;

        for (String model : modelCounts.keySet()) {

            int count = modelCounts.get(model);

            if (count > maxCount) {
                maxCount = count;
                popularModel = model;
            }
        }

        return popularModel;
    }

    // Get average number of purifiers per model
    public static double getAverageCountPerModel() {

        if (modelCounts.isEmpty()) {
            return 0.0;
        }

        return (double) totalPurifiers / modelCounts.size();
    }
}
