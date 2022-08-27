package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int getAverageSales(int[] sales) {
        int average = getSumSales(sales) / sales.length;
        return average;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int getAverageMinSales(int[] sales) {
        int averageMin = 0;
        for (int sale : sales) {
            if (sale < average(sales)) {
                averageMin += 1;
            }
        }
        return averageMin;
    }

    private double average(int[] sales) {
        return 0;
    }

    public int getAverageMaxSales(int [] sales) {
        int averageMax = 0;
        for (int sale : sales) {
            if (sale > average(sales)) {
                averageMax += 1;
            }
        }
        return averageMax;
    }
}
