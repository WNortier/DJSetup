import equipment.Laptop;
import equipment.Mixer;
import equipment.MonitorSpeakers;

public class DJSetup {
    MonitorSpeakers monitorSpeakers;
    Mixer mixer;
    Laptop laptop;

    public DJSetup(MonitorSpeakers monitorSpeakers, Mixer mixer, Laptop laptop) {
        this.monitorSpeakers = monitorSpeakers;
        this.mixer = mixer;
        this.laptop = laptop;
    }

    public MonitorSpeakers getMonitorSpeakers() {
        return this.monitorSpeakers;
    }

    public Mixer getMixer() {
        return this.mixer;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }
}