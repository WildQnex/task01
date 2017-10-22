package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ServiceFactory;

public class Main {
    public static void main(String[] args) {
        Criteria<SearchCriteria.Oven> criteria = new Criteria<>();
        criteria.setApplianceType("Oven");
        criteria.add(SearchCriteria.Oven.POWER_CONSUMPTION, 2000);
        criteria.add(SearchCriteria.Oven.WEIGHT, 11);
        Appliance app = ServiceFactory.getInstance().getApplianceService().find(criteria);
        System.out.println(app.toString());
    }

}
