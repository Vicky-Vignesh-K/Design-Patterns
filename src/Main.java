import com.factorydesignpattern.OS;
import com.factorydesignpattern.OperatingSystemFactory;

public class Main {
    public static void main(String[] args) {

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getInstance("popular");
        os.spec();

    }
}