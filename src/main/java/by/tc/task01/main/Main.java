package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //@Test
            Criteria<Oven> criteriaOven = new Criteria<Oven>();
            criteriaOven.setApplianceType("Oven");
            criteriaOven.add(Oven.POWER_CONSUMPTION, 1000);

            appliance = service.find(criteriaOven);

            by.tc.task01.entity.Oven oven = (by.tc.task01.entity.Oven)appliance;
            System.out.println(oven);
        System.out.println(oven.getPowerConsumption() == 1000);
            //.assertEquals(oven.getPowerConsumption(), 1000, 0.0000000000001);

       // @Test
            Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
            criteriaTabletPC.setApplianceType("TabletPC");
            criteriaTabletPC.add(TabletPC.COLOR, "BLUE");

            appliance = service.find(criteriaTabletPC);
            by.tc.task01.entity.TabletPC tabletPC = (by.tc.task01.entity.TabletPC)appliance;
        System.out.println(tabletPC);
        System.out.println(tabletPC.getColor().toUpperCase().equals("BLUE"));
            //Assert.assertEquals(tabletPC.getColor().toUpperCase(), "BLUE");


    }

}