package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    private double avgTemp;
    private double devTemp;
    private double minTemp;
    private double maxTemp;

    public TempSummaryStatistics(double[] temperatureSeries) {
        TemperatureSeriesAnalysis temp = new TemperatureSeriesAnalysis(temperatureSeries);
        avgTemp = temp.average();
        devTemp = temp.deviation();
        minTemp = temp.min();
        maxTemp = temp.max();
    }

}
