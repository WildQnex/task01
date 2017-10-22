package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.parser.LineParser;
import by.tc.task01.reader.FileReader;

import java.util.Optional;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        Optional<String> res = FileReader.readLines().stream()
                .filter(l -> l.toUpperCase().contains(criteria.getApplianceType().toUpperCase()))
                .filter(l -> criteria.getCriteria().entrySet().stream()
                        .allMatch(c -> l.toUpperCase().contains(c.getKey().toString().toUpperCase() + "=" + c.getValue().toString().toUpperCase() + ",") |
                                l.toUpperCase().contains(c.getKey().toString().toUpperCase() + "=" + c.getValue().toString().toUpperCase() + ";")))
                .findAny();

        if (res.isPresent()) {
            return LineParser.parseLine(res.get());
        }

        return null;
    }
}