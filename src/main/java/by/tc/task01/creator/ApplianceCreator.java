package by.tc.task01.creator;

import by.tc.task01.entity.*;

import java.util.List;

public final class ApplianceCreator {

    private ApplianceCreator(){}

    public static Appliance createAppliance(String applianceType, List<String> list) {

        switch (applianceType.toUpperCase()) {
            case "OVEN":
                if (list.size() != 6) {
                    return null;
                }
                return new Oven(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)),
                        Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Double.parseDouble(list.get(5)));

            case "LAPTOP":
                if (list.size() != 6) {
                    return null;
                }
                return new Laptop(Double.parseDouble(list.get(0)), list.get(1), Integer.parseInt(list.get(2)),
                        Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Integer.parseInt(list.get(5)));

            case "REFRIGERATOR":
                if (list.size() != 6) {
                    return null;
                }
                return new Refrigerator(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)),
                        Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));

            case "SPEAKERS":
                if (list.size() != 4) {
                    return null;
                }
                return new Speakers(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), new Range(list.get(2)),
                        Integer.parseInt(list.get(3)));

            case "TABLETPC":
                if (list.size() != 5) {
                    return null;
                }
                return new TabletPC(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)),
                        Integer.parseInt(list.get(3)), list.get(4));

            case "VACUUMCLEANER":
                if (list.size() != 6) {
                    return null;
                }
                return new VacuumCleaner(Integer.parseInt(list.get(0)), list.get(1), list.get(2), list.get(3),
                        Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));

            default:
                return null;
        }
    }
}
