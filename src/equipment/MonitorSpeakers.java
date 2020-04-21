package equipment;

public class MonitorSpeakers {
    private String brand;
    private int size;

    public MonitorSpeakers(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return this.size;
    }

    public void connect(){
        System.out.println("Connecting Monitor Speakers");
    }
}