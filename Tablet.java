package electronic_devices;

/**
 * Derived Class
 * Represents a tablet.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 30.09.23
 */
public class Tablet extends Device{

    private String OS;
    private int storage;

    /**
     * Creates a tablet with implemented parameters from super class Device(type, weight, price)
     * and specified OS, storage of tablet.
     * @param type
     * @param price
     * @param weight
     * @param OS
     * @param storage
     */
    public Tablet(String type, double price, double weight, String OS, int storage) {
        super(type, price, weight);
        this.OS = OS;
        this.storage = storage;
    }

    /**
     * Gets an OS of tablet.
     * @return A String representing tablet's OS.
     */
    public String getOS() {
        return OS;
    }

    /**
     * Sets an OS of tablet.
     * @param OS
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Gets a value of tablet's storage.
     * @return An integer representing tablet storage.
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Sets a value to tablet's storage.
     * @param storage
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * Returns a string representation of the object.
     * @return A String containing tablet and its properties.
     */
    @Override
    public String toString() {
        return "Tablet{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                ", OS=" + OS +
                ", storage=" + storage +
                '}';
    }
}
