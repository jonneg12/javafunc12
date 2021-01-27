package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.netology.Main.*;

public class ListLandPlotFactory {

    public List<LandPlot> getLandPlotList(int count) {
        List<LandPlot> landPlotList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            double width = Math.abs(MIN_PLOT_WIDTH + (MAX_PLOT_WIDTH - MIN_PLOT_WIDTH) * random.nextDouble());
            double length = Math.abs(MIN_PLOT_LENGTH + (MAX_PLOT_LENGTH - MIN_PLOT_LENGTH) * random.nextDouble());
            long sellPrice = Math.abs(MIN_PLOT_SELL_PRICE + random.nextInt((int)Math.abs(MAX_PLOT_SELL_PRICE - MIN_PLOT_SELL_PRICE)));
            landPlotList.add(new LandPlot(length, width, sellPrice));
        }
        return landPlotList;
    }





}
