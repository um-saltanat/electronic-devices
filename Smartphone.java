package electronic_devices;

/**
 * Derived Class
 * Represents a smartphone.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 30.09.23
 */

public class Smartphone extends Device{

    private double screenSize;
    private int cameraResolution;

    /**
     * Creates a smartphone with implemented parameters from superclass Device (type, price, weight)
     * and specified screen size, camera resolution.
     * @param type
     * @param price
     * @param weight
     * @param screenSize
     * @param cameraResolution
     */
    public Smartphone(String type, double price, double weight, double screenSize, int cameraResolution) {
        super(type, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    /**
     * Gets screen size of a smartphone.
     * @return A double representing smartphone's screen size.
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     * Sets a new value to the screen size of smartphone.
     * @param screenSize
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * Gets a camera resolution value of smartphone.
     * @return A double representing a resolution of smartphone's camera.
     */
    public int getCameraResolution() {
        return cameraResolution;
    }

    /**
     * Sets a camera resolution of smartphone.
     * @param cameraResolution
     */
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    /**
     * Returns a string representation of the object.
     * @return A String containing smartphone and its properties.
     */
    @Override
    public String toString() {
        return "Smartphone{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                ", screenSize=" + screenSize +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}
