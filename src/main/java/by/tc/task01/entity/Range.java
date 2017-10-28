package by.tc.task01.entity;

public class Range {

    private static String DELIMITER = "-";

    private double minBound;
    private double maxBound;


    public Range(String range) {
        String[] values = range.split(DELIMITER);
        this.minBound = Double.parseDouble(values[0]);
        this.maxBound = Double.parseDouble(values[1]);
    }

    public double getMinBound() {
        return minBound;
    }

    public void setMinBound(double minBound) {
        this.minBound = minBound;
    }

    public double getMaxBound() {
        return maxBound;
    }

    public void setMaxBound(double maxBound) {
        this.maxBound = maxBound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Range range = (Range) o;

        if (Double.compare(range.minBound, minBound) != 0) return false;
        return Double.compare(range.maxBound, maxBound) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(minBound);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxBound);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return minBound + DELIMITER + maxBound;
    }
}
