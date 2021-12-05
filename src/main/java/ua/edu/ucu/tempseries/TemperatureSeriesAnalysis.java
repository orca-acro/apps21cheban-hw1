package ua.edu.ucu.tempseries;

import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {
    private double[] temperatureSeries;

    public TemperatureSeriesAnalysis() {
        this.temperatureSeries = new double[]{};

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        for (double el : temperatureSeries) {
            if (el < -273) {
                throw new InputMismatchException();
            } else {
                this.temperatureSeries = Arrays.copyOf(temperatureSeries,
                        temperatureSeries.length);
            }
        }
    }

    public double average() {
        double aver = 0.0;
        if (this.temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        } else {
            for (double el : this.temperatureSeries) {
                aver += el;
            }
            aver = aver / this.temperatureSeries.length;
        }
        return aver;
    }

    public double deviation() {
        double dev = 0.0;
        double aver = average();
        for (double el : this.temperatureSeries) {
            dev += (el - aver)*(el - aver);
        }
        return dev;
    }


    public double min() {
        if (this.temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        } else {
            Arrays.sort(temperatureSeries);
        }
        return temperatureSeries[0];
    }

    public double max() {
        if (this.temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        } else {
            Arrays.sort(temperatureSeries);
        }
        return temperatureSeries[temperatureSeries.length - 1];
    }

    public double findTempClosestToZero() {
        double mood = Math.abs(temperatureSeries[0]);
        double closest = temperatureSeries[0];
        for (double temp : temperatureSeries) {
            double current = Math.abs(temp);
            if (current < mood) {
                closest = temp;
                mood = current;
            }
        }
        return closest;
    }

    public double findTempClosestToValue(double tempValue) {
        double mood = Math.abs(temperatureSeries[0] - tempValue);
        double closest = temperatureSeries[0];
        for (double temp : temperatureSeries) {
            double current = Math.abs(temp - tempValue);
            if (current < mood) {
                closest = temp;
                mood = current;
            }
        }
        return closest;
    }

    public double[] findTempsLessThen(double tempValue) {
        int counter = 0;
        Arrays.sort(temperatureSeries);
        for (double temp : temperatureSeries) {
            if (temp < tempValue) {
                counter += 1;
            }
        }
        double[] result = new double[counter];
        for (int i = 0; i < temperatureSeries.length; i++) {
            if (temperatureSeries[i] < tempValue) {
                result[i] = temperatureSeries[i];
            }
        }
        return result;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        int counter = 0;
        Arrays.sort(temperatureSeries);
        for (double temp : temperatureSeries) {
            if (temp >= tempValue) {
                counter += 1;
            }
        }
        double[] result = new double[counter];
        int idx = 0;
        for (double temp : temperatureSeries) {
            if (temp >= tempValue) {
                result[idx] = temp;
                idx += 1;
            }
        }
        return result;
    }

    public TempSummaryStatistics summaryStatistics() {
        return new TempSummaryStatistics(temperatureSeries);
    }

    public double addTemps(double... temps) {
        if (temperatureSeries.length == 0) {
            temperatureSeries = temps;
        } else {
            double[] temporary = new double[temperatureSeries.length
                    + temps.length];
            for (int i = 0; i < temperatureSeries.length; i++) {
                temporary[i] = temperatureSeries[i];
            }
            int counter = 0;
            for (int i = temperatureSeries.length; i < temporary.length; i++) {
                if (counter != temps.length) {
                    temporary[i] = temps[counter];
                    counter += 1;
                }
            }
            temperatureSeries = temporary;
        }
        double suma = 0;
        for (double temp : temperatureSeries) {
            suma += temp;
        }
        return suma;
    }
}
