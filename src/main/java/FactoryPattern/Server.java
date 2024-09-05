package FactoryPattern;

public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;
    private String graphics;

    public Server(String ram, String hdd, String cpu, String graphics) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.graphics = graphics;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getGraphics() {
        return this.graphics;
    }

}
