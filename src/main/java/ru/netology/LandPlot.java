package ru.netology;

public class LandPlot {
    public static long idMain = 0;

    private final double length;
    private final double width;
    private final long sellPrice;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public long getSellPrice() {
        return sellPrice;
    }

    public LandPlot(double length, double width, long sellPrice) {
        this.length = length;
        this.width = width;
        this.sellPrice = sellPrice;

    }

    @Override
    public String toString() {
        return "LandPlot{" +
                "length=" + length +
                ", width=" + width +
                ", sellPrice=" + sellPrice +
                '}';
    }
}
