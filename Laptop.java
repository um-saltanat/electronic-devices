package electronic_devices;

/**
 * Derived Class
 * Represents a laptop.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 30.09.23
 */
public class Laptop extends Device{

    private String CPU;
    private int RAM;

    /**
     * Creates a laptop with implemented parameters from superclass Device
     * and specified CPU and RAM of laptop.
     * @param type
     * @param price
     * @param weight
     * @param CPU
     * @param RAM
     */
    public Laptop(String type, double price, double weight, String CPU, int RAM) {
        super(type, price, weight);
        this.CPU = CPU;
        this.RAM = RAM;
    }

    /**
     * Gets a CPU of a laptop.
     * @return A String representing laptop CPU.
     */
    public String getCPU() {
        return CPU;
    }

    /**
     * Sets a new value to CPU attribute.
     * @param CPU
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Gets a RAM of laptop.
     * @return An integer representing laptop RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * Sets a new value to laptop RAM.
     * @param RAM
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    /**
     * Returns a string representation of the object.
     * @return A String containing laptop and its properties.
     */
    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                ", CPU=" + CPU +
                ", RAM=" + RAM +
                '}';
    }
}
