package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, 4.0, -9.5, 1.0, 7.6, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.72857;

        double actualResult = seriesAnalysis.average();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testDeviationWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testDeviation() {
        double[] temperatureSeries = {3.0, 4.0, -9.5, 1.0, 7.6, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 15764.69428;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testMin() {
        double[] temperatureSeries = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -78.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMaxWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testMax() {
        double[] temperatureSeries = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 98.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToZeroWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testFindTempClosestToZero() {
        double[] temperatureSeries = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToValueWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(34.9);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testFindTempClosestToValue() {
        double[] temperatureSeries = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 7.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(34.9);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testTempsLessThanWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult1 = {-1.0};
        double[] expResult2 = {};

        double[] actualResult1 = seriesAnalysis.findTempsLessThen(34.9);
        double[] actualResult2 = seriesAnalysis.findTempsLessThen(-2.0);


        assertEquals(Arrays.toString(expResult1), Arrays.toString(actualResult1));
        assertEquals(Arrays.toString(expResult2), Arrays.toString(actualResult2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTempsLessThanWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testFindTempsLessThan() {
        double[] temperatureSeries = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult1 = {-78.0, -9.0, 1.0, 3.0, 4.0};
        double[] expResult2 = {};

        double[] actualResult1 = seriesAnalysis.findTempsLessThen(7.0);
        double[] actualResult2 = seriesAnalysis.findTempsLessThen(-250.89);

        assertEquals(Arrays.toString(expResult1), Arrays.toString(actualResult1));
        assertEquals(Arrays.toString(expResult2), Arrays.toString(actualResult2));
    }

    @Test
    public void testTempsGreaterThanWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult1 = {-1.0};
        double[] expResult2 = {};

        double[] actualResult1 = seriesAnalysis.findTempsGreaterThen(-45.67);
        double[] actualResult2 = seriesAnalysis.findTempsGreaterThen(5.0);


        assertEquals(Arrays.toString(expResult1), Arrays.toString(actualResult1));
        assertEquals(Arrays.toString(expResult2), Arrays.toString(actualResult2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTempsGreaterThanWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        throw new IllegalArgumentException();
    }

    @Test
    public void testFindTempsGreaterThan() {
        double[] temperatureSeries = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult1 = {7.0, 98.0};
        double[] expResult2 = {};

        double[] actualResult1 = seriesAnalysis.findTempsGreaterThen(7.0);
        double[] actualResult2 = seriesAnalysis.findTempsGreaterThen(100.90);

        assertEquals(Arrays.toString(expResult1), Arrays.toString(actualResult1));
        assertEquals(Arrays.toString(expResult2), Arrays.toString(actualResult2));
    }

    @Test
    public void testAddTempsWithOneElementArray() {
        double[] temperatureSeries1 = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis1 = new TemperatureSeriesAnalysis(temperatureSeries1);
        double[] temperatureSeries2 = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis2 = new TemperatureSeriesAnalysis(temperatureSeries2);
        double expResult1 = 46.77;
        double expResult2 = 6.5;
        double[] seq1 = {78.67, 4.0, -34.9};
        double seq2 = 7.5;

        double actualResult1 = seriesAnalysis1.addTemps(seq1);
        double actualResult2 = seriesAnalysis2.addTemps(seq2);

        assertEquals(expResult1, actualResult1, 0.00001);
        assertEquals(expResult2, actualResult2, 0.00001);

    }

    @Test
    public void testAddTempsWithEmptyArray() {
        TemperatureSeriesAnalysis seriesAnalysis1 = new TemperatureSeriesAnalysis();
        TemperatureSeriesAnalysis seriesAnalysis2 = new TemperatureSeriesAnalysis();
        double expResult1 = 47.77;
        double expResult2 = 7.5;
        double[] seq1 = {78.67, 4.0, -34.9};
        double seq2 = 7.5;

        double actualResult1 = seriesAnalysis1.addTemps(seq1);
        double actualResult2 = seriesAnalysis2.addTemps(seq2);

        assertEquals(expResult1, actualResult1, 0.00001);
        assertEquals(expResult2, actualResult2, 0.00001);

    }

    @Test
    public void testAddTemps() {
        double[] temperatureSeries1 = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis1 = new TemperatureSeriesAnalysis(temperatureSeries1);
        double[] temperatureSeries2 = {3.0, 4.0, -9.0, 1.0, 7.0, 98.0, -78.0};
        TemperatureSeriesAnalysis seriesAnalysis2 = new TemperatureSeriesAnalysis(temperatureSeries2);
        double expResult1 = 73.77;
        double expResult2 = 33.5;
        double[] seq1 = {78.67, 4.0, -34.9};
        double seq2 = 7.5;

        double actualResult1 = seriesAnalysis1.addTemps(seq1);
        double actualResult2 = seriesAnalysis2.addTemps(seq2);

        assertEquals(expResult1, actualResult1, 0.00001);
        assertEquals(expResult2, actualResult2, 0.00001);

    }

}
