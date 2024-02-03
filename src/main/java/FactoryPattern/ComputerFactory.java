package FactoryPattern;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        return switch (type) {
            case "Laptop" -> new Laptop(ram, hdd, cpu);
            case "Server" -> new Server(ram, hdd, cpu);
            default -> null;
        };
    }
}
