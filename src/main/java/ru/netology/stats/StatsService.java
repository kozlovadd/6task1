package ru.netology.stats;

public class StatsService {
    //сумма
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    //среднее
    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / sales.length;
        return averageSale;
    }

    //месяц в котором максимум продаж
    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    //месяц в котором минимум продаж
    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    //продажи ниже среднего
    public int salesBellowAverege(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
            return counter;

    }
    //продажи выше среднего
    public int salesHigherAverege(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;

    }
}
