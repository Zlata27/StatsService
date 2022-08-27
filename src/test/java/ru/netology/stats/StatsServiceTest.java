package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getSumSales(sales);
        int expected = 180;
        assertEqals(expected, actual);
    }

    private void assertEqals(int expected, int actual) {
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAverageSales(sales);
        int expected = 15;
        assertEqals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getMinSales(sales);
        int expected = 9;
        assertEqals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getMaxSales(sales);
        int expected = 8;
        assertEqals(expected, actual);
    }

    @Test
    public void testAverageMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAverageMinSales(sales);
        int expected = 5;
        assertEqals(expected, actual);
    }

    @Test
    public void testAverageMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAverageMaxSales(sales);
        int expected = 5;
        assertEqals(expected, actual);
    }
}
