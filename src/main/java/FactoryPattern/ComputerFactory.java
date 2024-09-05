package FactoryPattern;

public class ComputerFactory {
    public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu, String graphics) {
        return switch (computerType) {
            case LAPTOP -> new Laptop(ram, hdd, cpu);
            case SERVER -> new Server(ram, hdd, cpu, graphics);
            case PERSONAL_COMPUTER -> null;
        };
    }
}
