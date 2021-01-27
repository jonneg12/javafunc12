package ru.netology;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ru.netology.Main.*;

public class ListLandPlotFactory {

    public List<LandPlot> getLandPlotList(int count) {

        return Arrays.stream(new LandPlot[count])
                .map(x -> new LandPlot(Math.abs(MIN_PLOT_WIDTH + (MAX_PLOT_WIDTH - MIN_PLOT_WIDTH) * Math.random()),
                        Math.abs(MIN_PLOT_LENGTH + (MAX_PLOT_LENGTH - MIN_PLOT_LENGTH) * Math.random()),
                        (long) Math.abs(MIN_PLOT_SELL_PRICE + (MAX_PLOT_SELL_PRICE - MIN_PLOT_SELL_PRICE) * Math.random())))
                .collect(Collectors.toList());
    }


}
