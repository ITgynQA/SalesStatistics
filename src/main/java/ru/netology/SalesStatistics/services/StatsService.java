package ru.netology.SalesStatistics.services;

public class StatsService {

    public int totalSales(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = totalSales(sales);
        int average;
        average = sum / 12;

        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateMinMonth(int[] sales) {
        int average = averageSales(sales);
        int countMinMonth = 0;
        for (int n : sales) {
            if (n < average) {
                countMinMonth++;
            }
        }
        return countMinMonth;
    }


    public int calculateMaxMonth(int[] sales) {
        int average = averageSales(sales);
        int countMaxMonth = 0;
        for (int n : sales) {
            if (n > average) {
                countMaxMonth++;
            }
        }
        return countMaxMonth;
    }
}




