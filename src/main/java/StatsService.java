public class StatsService {
    public int minSales(long[] sales) {//Метод ниже считает номер месяца минимальных продаж
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

    public int maxSales(long[] sales) {//Метод ниже считает номер месяца максимальных  продаж
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {//Метод ниже считает сумму  продаж
        long sum = 0;
        for (long num : sales) {
            // суммирование каждого элемента массива
            sum = sum + num;
        }
        return sum;
    }

    public long avgSales(long[] sales) {//Метод ниже считает среднюю сумму  продаж
        long sum = 0;
        sum = sumSales(sales);
        return sum / sales.length;
    }

    public long avgLowerSales(long[] sales) {
        long sum = 0;
        long cnt = 0;
        sum = sumSales(sales);
        long avgSum = sum / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (avgSum < sales[i]) {
                cnt = cnt + 1;
            }
        }
        return cnt;
    }

    public long avgHigherSales(long[] sales) {
        long sum = 0;
        long cnt = 0;
        sum = sumSales(sales);
        long avgSum = sum / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (avgSum > sales[i]) {
                cnt = cnt + 1;
            }
        }
        return cnt;
    }
}
