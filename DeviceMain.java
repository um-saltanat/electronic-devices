package electronic_devices;

import java.util.Random;
import java.util.Scanner;

public class DeviceMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Put number of devices (from 1 to 20) you'd like to create: ");
        int numOfDevices = scan.nextInt();
        double totalPrice = 0;
        double totalWeight = 0;

        if (numOfDevices > 0 && numOfDevices < 21) {
            for (int i = 0; i < numOfDevices; i++) {
                int num = random.nextInt(1, 4);
                switch (num) {
                    case 1 :
                        double weightPhone = random.nextDouble(140,170);        // gram
                        double pricePhone = random.nextDouble(500, 800);        // dollars
                        double screenSize = random.nextDouble(14, 16);          // cm
                        int cameraResolution = random.nextInt(12, 16);          // MP
                        Smartphone smartphone = new Smartphone("Smartphone", Math.round(pricePhone * 100.0)/100.0, Math.round(weightPhone * 100.0)/100.0, Math.round(screenSize), cameraResolution);
                        System.out.println(smartphone);
                        totalPrice += pricePhone;
                        totalWeight += weightPhone;
                        break;

                    case 2 :
                        double weightLaptop = random.nextDouble(2000,3000);         // grams
                        double priceLaptop = random.nextDouble(500, 800);           // dollars
                        String[] CPU = {"Intel Core", "Intel Core i9", "Intel Core i7", "Apple M1 Max"};
                        int selectCPU = random.nextInt(CPU.length);
                        int[] RAM = {8,16,32};                                                   // MHz
                        int selectRAM = random.nextInt(RAM.length);
                        Laptop laptop = new Laptop("Laptop",  Math.round(priceLaptop * 100.0)/100.0,Math.round(weightLaptop * 100.0)/100.0, CPU[selectCPU], RAM[selectRAM]);
                        System.out.println(laptop);
                        totalPrice += priceLaptop;
                        totalWeight += weightLaptop;
                        break;

                    case 3 :
                        double weightTablet = random.nextDouble(400,1000);        // grams
                        double priceTablet = random.nextDouble(300, 800);         // dollars
                        String[] OS = {"Windows", "Apple IOS", "Android"};
                        int selectOS = random.nextInt(OS.length);
                        int[] storage = {32, 64, 128, 256};                                    // GB
                        int selectStorage = random.nextInt(storage.length);
                        Tablet tablet = new Tablet("Tablet",  Math.round(priceTablet * 100.0)/100.0, Math.round(weightTablet * 100.0)/100.0, OS[selectOS], storage[selectStorage]);
                        System.out.println(tablet);
                        totalPrice += priceTablet;
                        totalWeight += weightTablet;
                        break;

                    default :
                        System.out.println("There isn't such case");
                }

            }
        }
        else {
            System.out.println("Invalid number of devices.");
        }

        System.out.println("Total price of all devices: " + Math.round(totalPrice * 100.0)/100.0);
        System.out.println("Total weight of all devices: " + Math.round(totalWeight * 100.0)/100.0);
    }
}
