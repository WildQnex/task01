package by.tc.task01.parser;

import by.tc.task01.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineParser {

    private static final Pattern VALUES_PATTERN = Pattern.compile("(?<==)(((\\w+)|(\\d+.?\\d+?))-?)+(?=[,;])");

    private LineParser() {
    }

    public static Appliance parseLine(String line) {

        List<String> list = new ArrayList<>();
        Matcher matcher = VALUES_PATTERN.matcher(line);
        while (matcher.find()) {
            list.add(matcher.group());
        }

        String[] appliance = line.split(":");
        String applianceType = appliance[0].trim();

        return ApplianceCreator.createAppliance(applianceType, list);
    }
}
