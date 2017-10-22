package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

    private String applianceType;

    private Map<E, Object> criteria = new HashMap<E, Object>();

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public Map<E, Object> getCriteria() {
        return criteria;
    }

    public void add(E searchCriteria, Double value) {
        if(Math.round(value) == value){
            criteria.put(searchCriteria, Math.round(value));
        }else {
            criteria.put(searchCriteria, value);
        }
    }

    public void add(E searchCriteria, Float value) {
        if(Math.round(value) == value){
            criteria.put(searchCriteria, Math.round(value));
        }else {
            criteria.put(searchCriteria, value);
        }
    }

    public Criteria(){
        applianceType = "";
    }

}