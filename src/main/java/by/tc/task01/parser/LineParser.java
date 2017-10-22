package by.tc.task01.parser;

import by.tc.task01.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineParser {

    private static final Pattern VALUES_PATTERN = Pattern.compile("(?<==)(((\\w+)|(\\d+.?\\d+?))-?)+(?=,|;)");

    private LineParser(){}

    public static Appliance parseLine(String line){
        List<String> list = new ArrayList<>();
        Matcher matcher = VALUES_PATTERN.matcher(line);
        while (matcher.find()){
            list.add(matcher.group());
        }
        String[] appliance = line.split(":");
        String applianceType = appliance[0].trim();
        switch (applianceType){
            case "Oven":
                return new Oven(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)),
                        Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Double.parseDouble(list.get(5)));
            case "Laptop":
                return new Laptop(Double.parseDouble(list.get(0)), list.get(1), Integer.parseInt(list.get(2)),
                        Integer.parseInt(list.get(3)), Double.parseDouble(list.get(4)), Integer.parseInt(list.get(5)));
            case "Refrigerator":
                return new Refrigerator(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)),
                        Double.parseDouble(list.get(3)), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
            case "Speakers":
                return new Speakers(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), new Range(list.get(2)),
                        Integer.parseInt(list.get(4)));
            case "TabletPC":
                return new TabletPC(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), Integer.parseInt(list.get(2)),
                        Integer.parseInt(list.get(3)), list.get(4));
            case "VacuumCleaner":
                return new VacuumCleaner(Integer.parseInt(list.get(0)), list.get(1), list.get(2), list.get(3),
                        Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)));
            default:
                return null;
        }
    }
}
