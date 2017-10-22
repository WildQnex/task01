package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {

        Set<Object> criteriaValues = new HashSet<>(criteria.getCriteria().values());

        if (criteriaValues.size() == 0) {
            System.out.print("No criteria specified. ");
            return false;
        }
        for (Object value : criteriaValues) {
            if (value == null) {
                System.out.print("Criterion value is null. ");
                return false;
            }

            if (value instanceof Number) {
                Number valueNumber = (Number) value;
                double number = valueNumber.doubleValue();
                if (number <= 0) {
                    System.out.print("The numerical value of criterion can not be less than or equal to zero. ");
                    return false;
                }
            } else if (value instanceof String) {
                String valueString = (String) value;
                if (valueString.isEmpty()) {
                    System.out.print("The string value of criterion is empty. ");
                    return false;
                }
            }
        }

        return true;
    }

    // you may add your own code here

}

// you may add your own new classes