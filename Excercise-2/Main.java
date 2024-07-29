public class Main {
    public static void main(String[] args) {
        // Create devices
        Device light1 = new Light(1);
        Device thermostat1 = new Thermostat(2, 70);
        Device door1 = new DoorLock(3);

        // Display initial status
        System.out.println("Initial Status:");
        System.out.println(light1.status());
        System.out.println(thermostat1.status());
        System.out.println(door1.status());
        System.out.println();

        // Interact with devices
        System.out.println("Turning on the light...");
        light1.turnOn();

        System.out.println("Setting thermostat temperature to 75 degrees...");
        ((Thermostat) thermostat1).setTemperature(75); // Casting to Thermostat to access setTemperature method

        System.out.println("Unlocking the door...");
        ((DoorLock) door1).unlock(); // Casting to DoorLock to access unlock method

        // Display updated status
        System.out.println("\nUpdated Status:");
        System.out.println(light1.status());
        System.out.println(thermostat1.status());
        System.out.println(door1.status());
    }
}