package equipment;

public class Laptop {
    private String brand;
    private int ramSlots;
    private String processor;

    public Laptop(String brand, int ramSlots, String processor) {
        this.brand = brand;
        this.ramSlots = ramSlots;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getProcessor() {
        return processor;
    }

    public void powerUp(){
        System.out.println("Laptop Powering On");
    }
}
