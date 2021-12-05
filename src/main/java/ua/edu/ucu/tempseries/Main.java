package ua.edu.ucu.tempseries;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        double[] tem = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        double[] kar = {8.0, 6.0, -10.4};
        TemperatureSeriesAnalysis temp = new TemperatureSeriesAnalysis(tem);
        System.out.println(temp.addTemps(kar));
        System.out.println(temp.summaryStatistics());

    }
}
