import pl.kocan.flyweight.Destroyer;
import pl.kocan.flyweight.Rifleman;
import pl.kocan.flyweight.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        final List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            activeUnits.add(new TeslaTank(0, 0));
            activeUnits.add(new Rifleman(0, 0));
            activeUnits.add(new Destroyer(0, 0));
        }

    }

}
