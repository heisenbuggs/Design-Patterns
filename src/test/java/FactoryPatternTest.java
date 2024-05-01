import FactoryPattern.Computer;
import FactoryPattern.ComputerFactory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("Laptop","32 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server","512 GB","1 TB","14.5 GHz");

        System.out.println("Factory PC Config :: " + laptop);
        System.out.println("Factory Server Config :: " + server);
    }
}
