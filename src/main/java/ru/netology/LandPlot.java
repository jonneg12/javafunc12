package ru.netology;

public class LandPlot {
    public static long idMain = 0;

    private long id;
    private double length;
    private double width;
    private long sellPrice;

    public long getId() {
        return id;
    }

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
        this.id = ++idMain;
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
