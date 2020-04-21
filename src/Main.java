
import equipment.CdCollection;
import equipment.Laptop;
import equipment.Mixer;
import equipment.MonitorSpeakers;

public class Main {

    public static void main(String[] args) {
        MonitorSpeakers monitorSpeakers = new MonitorSpeakers("Yamaha", 7);
        Laptop laptop = new Laptop("MSI", 4, "i7");
        Mixer mixer = new Mixer(2, "Native Instruments", true, new CdCollection(50));
        DJSetup djSetup = new DJSetup(monitorSpeakers, mixer, laptop);

        System.out.println("Monitor Speakers are " + monitorSpeakers.getSize() + " inch " + monitorSpeakers.getBrand() + " speakers");
        System.out.println("Laptop Setup is a " + laptop.getBrand() + " " + laptop.getProcessor() + " with " + laptop.getRamSlots() + " ram slots");
        System.out.println("Mixer is a " + mixer.getDecks() + " deck " + mixer.getBrand());
        System.out.println("\n");

        djSetup.getLaptop().powerUp();
        djSetup.monitorSpeakers.connect();
        System.out.println(mixer.getCdCollection() + " cds in collection");
        djSetup.getMixer().pressPlay();
    }
}