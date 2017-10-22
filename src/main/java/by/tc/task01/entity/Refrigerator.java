package by.tc.task01.entity;

public class Refrigerator extends Appliance {

    private int powerConsumption;
    private int weight;
    private int freezerCpacity;
    private double overalCapacity;
    private int height;
    private int width;

    public Refrigerator(int powerConsumption, int weight, int freezerCpacity, double overalCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCpacity = freezerCpacity;
        this.overalCapacity = overalCapacity;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCpacity() {
        return freezerCpacity;
    }

    public void setFreezerCpacity(int freezerCpacity) {
        this.freezerCpacity = freezerCpacity;
    }

    public double getOveralCapacity() {
        return overalCapacity;
    }

    public void setOveralCapacity(double overalCapacity) {
        this.overalCapacity = overalCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (weight != that.weight) return false;
        if (freezerCpacity != that.freezerCpacity) return false;
        if (Double.compare(that.overalCapacity, overalCapacity) != 0) return false;
        if (height != that.height) return false;
        return width == that.width;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + freezerCpacity;
        temp = Double.doubleToLongBits(overalCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCpacity=" + freezerCpacity +
                ", overalCapacity=" + overalCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
