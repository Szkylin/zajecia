package devices;

public class Phone extends Device{

    final public String model;
    final public Double screenSize;
    final public String operatingSystem;
    static final public String defaultServer = "googleplay.com";
    static final public String defaultProtocol = "http";
    static final public String defaultVersion = "5.0";
    public Phone(String model, Double screenSize, String operatingSystem)
    {
        this.model = model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return model + " " + screenSize + " " + operatingSystem;
    }
    public void turnOn() {
        this.mode = "On";
        System.out.println(this.producer+" "+this.model+" starts working...");
    }
}