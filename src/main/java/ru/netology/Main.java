package ru.netology;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static final int MAX_PLOT_WIDTH = 10;
    public static final int MIN_PLOT_WIDTH = 100;
    public static final double MAX_PLOT_LENGTH = 10;
    public static final double MIN_PLOT_LENGTH = 100;
    public static final long MAX_PLOT_SELL_PRICE = 100;
    public static final long MIN_PLOT_SELL_PRICE = 10;
    public static final long NORM_PLOT_SELL_PRICE = 50;
    public static final int COUNT_PLOTS = 1000;

    public static void main(String[] args) {

        ListLandPlotFactory listLandPlotFactory = new ListLandPlotFactory();

        List<LandPlot> landPlotList = listLandPlotFactory.getLandPlotList(COUNT_PLOTS);

                landPlotList.stream()
                .collect(Collectors.toMap(k -> k, k -> k.getSellPrice() < NORM_PLOT_SELL_PRICE ? "NORM" : "HIGH"))
                .forEach((x,y) -> System.out.printf("Width: %6.3f \t length: %6.3f \t sell price: %3d \t price is %4s %n",
                        x.getWidth(), x.getLength(), x.getSellPrice(), y));

    }

}
