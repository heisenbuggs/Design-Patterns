import FactoryPattern.Computer;
import FactoryPattern.ComputerFactory;
import FactoryPattern.ComputerType;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP,"32 GB","500 GB","2.4 GHz", null);
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER,"512 GB","1 TB","14.5 GHz", "32 GB");

        System.out.println("Factory Laptop Config :: " + laptop);
        System.out.println("Factory Server Config :: " + server);
    }
}
