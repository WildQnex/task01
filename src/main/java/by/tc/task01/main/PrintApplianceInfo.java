package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

    private PrintApplianceInfo(){}

    public static void print(Appliance appliance) {
        System.out.println("Appliance:");
        System.out.println(appliance);
    }
}
