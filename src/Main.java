//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Задание N1");

        byte a1 = 1;
        short b1 = 300;
        int c1 = 100000;
        long d1 = 2000000L;
        float e1 = 1.5f;
        double f1 = 35.35;

        System.out.println("Значение переменной a1 с типом byte равно " + a1 );
        System.out.println("Значение переменной b1 с типом short равно " + b1 );
        System.out.println("Значение переменной c1 с типом int равно " + c1 );
        System.out.println("Значение переменной d1 с типом long равно " + d1 );
        System.out.println("Значение переменной e1 с типом float равно " + e1 );
        System.out.println("Значение переменной f1 с типом double равно " + f1 );

        System.out.println("");
        System.out.println("Задание N2");

        byte a2 = 67;
        short b2 = 569;
        short b22 = 27897;
        int c2 = -159;
        long d2 = 987678965549L;
        float e2 = 27.12f;
        double f2 = 2.786;

        System.out.println("");
        System.out.println("Задание N3");

        byte lpClassStudentsAmount = 23;
        byte asClassStudentsAmount = 27;
        byte eaClassStudentsAmount = 30;
        short totalPaperAmount = 480;
        int paperPerStudentAmount = totalPaperAmount / (lpClassStudentsAmount + asClassStudentsAmount + eaClassStudentsAmount);

        System.out.println("На каждого ученика рассчитано " + paperPerStudentAmount +" листов бумаги.");

        System.out.println("");
        System.out.println("Задание N4");

        byte machinePerformancePerStandardInterval = 16;
        byte standardInterval = 2;
        byte day1 = 1;
        byte minutes20 = 20;
        int day3 = day1 * 3;
        // Варианты значения "месяц" в сутках.
        int month28 = day1 * 28;
        int month29 = day1 * 29;
        int month30 = day1 * 30;
        int month31 = day1 * 31;
        // За базовую выработку принять суточную, из расчета 1440 минут в сутках.
        int intervals1Day = 1440 / standardInterval;
        int intervals20Minutes = intervals1Day / (24*3);
        int intervals3Days = intervals1Day * day3;
        int intervals28DaysMonth = intervals1Day * month28;
        int intervals29DaysMonth = intervals1Day * month29;
        int intervals30DaysMonth = intervals1Day * month30;
        int intervals31DaysMonth = intervals1Day * month31;

        int machinePerformancePer20Minutes = machinePerformancePerStandardInterval * intervals20Minutes;
        int machinePerformancePer1Day = machinePerformancePerStandardInterval * intervals1Day;
        int machinePerformancePer3Day = machinePerformancePerStandardInterval * intervals3Days;
        int machinePerformancePer28DaysMonth = machinePerformancePerStandardInterval * intervals28DaysMonth;
        int machinePerformancePer29DaysMonth = machinePerformancePerStandardInterval * intervals29DaysMonth;
        int machinePerformancePer30DaysMonth = machinePerformancePerStandardInterval * intervals30DaysMonth;
        int machinePerformancePer31DaysMonth = machinePerformancePerStandardInterval * intervals31DaysMonth;


        System.out.println("За " + minutes20 + " минут машина произвела " + machinePerformancePer20Minutes + " штук бутылок.");
        System.out.println("За " + day1 + " день машина произвела " + machinePerformancePer1Day + " штук бутылок.");
        System.out.println("За " + day3 + " дня машина произвела " + machinePerformancePer3Day + " штук бутылок.");
        System.out.println("За " + month28 + " дней машина произвела " + machinePerformancePer28DaysMonth + " штук бутылок.");
        System.out.println("За " + month29 + " дней машина произвела " + machinePerformancePer29DaysMonth + " штук бутылок.");
        System.out.println("За " + month30 + " дней машина произвела " + machinePerformancePer30DaysMonth + " штук бутылок.");
        System.out.println("За " + month31 + " день машина произвела " + machinePerformancePer31DaysMonth + " штук бутылок.");


        System.out.println("");
        System.out.println("Задание N5");

        byte totalCans = 120;
        byte cansPerClassWhitePaint = 2;
        byte cansPerClassBrownPaint = 4;
        int totalCansPerClass = cansPerClassWhitePaint + cansPerClassBrownPaint;
        int classAmount = totalCans / totalCansPerClass;
        int totalCansWhitePaint = classAmount * cansPerClassWhitePaint;
        int totalCansBrownPaint = classAmount * cansPerClassBrownPaint;

        System.out.println("В школе, где " + classAmount + " классов, нужно " + totalCansWhitePaint + " банок белой краски и " + totalCansBrownPaint + " банок коричневой краски");


        System.out.println("");
        System.out.println("Задание N6");

        byte bananasAmount = 5;
        byte milkAmount = 1;
        byte iceCreamAmount = 2;
        byte eggsAmount = 4;

        byte gram = 1;
        int kiloGram = gram * 1000;

        int bananasWeight = gram * 80;
        int milkWeight = gram * 105;
        int iceCreamWeight = gram * 100;
        int eggsWeight = gram * 70;

        int totalBananasWeight = bananasAmount * bananasWeight;
        int totalMilkWeight = milkAmount * milkWeight;
        int totalIceCreamWeight = iceCreamAmount * iceCreamWeight;
        int totalEggsWeight = eggsAmount * eggsWeight;

        int totalBreakfastWeightGrams = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;

        float totalBreakfastWeightKiloGrams = (float) totalBreakfastWeightGrams / kiloGram;

        System.out.println("Вес завтрака в граммах составляет " + totalBreakfastWeightGrams + " грамм, или " + totalBreakfastWeightKiloGrams + " килограмм.");


        System.out.println("");
        System.out.println("Задание N7");

        //Переменные gram и kiloGram объявлены  и инициализированы в задании 6
        int totalLooseWeight = kiloGram * 7;
        int minimalLooseWeightPerDay = gram * 250;
        int maximalLooseWeightPerDay = gram * 500;
        int minimalLooseWeightDays = totalLooseWeight / maximalLooseWeightPerDay;
        int maximalLooseWeightDays = totalLooseWeight / minimalLooseWeightPerDay;
        int averageLooseWeightDays = (minimalLooseWeightDays + maximalLooseWeightDays) / 2;

        System.out.println("При темпе в " + minimalLooseWeightPerDay + " грамм в день, спортсмен сбросит " + totalLooseWeight + " грамм за " + maximalLooseWeightDays + " дней.");
        System.out.println("При темпе в " + maximalLooseWeightPerDay + " грамм в день, спортсмен сбросит " + totalLooseWeight + " грамм за " + minimalLooseWeightDays + " дней.");
        System.out.println("В среднем темпе спортсмен сбросит " + totalLooseWeight + " грамм за " + averageLooseWeightDays + " день.");


        System.out.println("");
        System.out.println("Задание N8");

        int mCurrentMonthSalary = 67760;
        int dCurrentMonthSalary = 83690;
        int kCurrentMonthSalary = 76230;

        float salaryGrowthPercentage = (float) 1.1;

        byte year = 12;

        int mCurrentYearSalary = mCurrentMonthSalary * year;
        int dCurrentYearSalary = dCurrentMonthSalary * year;
        int kCurrentYearSalary = kCurrentMonthSalary * year;

        float mFutureMonthSalary = (float) mCurrentMonthSalary * salaryGrowthPercentage;
        float dFutureMonthSalary = (float) dCurrentMonthSalary * salaryGrowthPercentage;
        float kFutureMonthSalary = (float) kCurrentMonthSalary * salaryGrowthPercentage;

        float mFutureYearSalary = (float) mFutureMonthSalary * year;
        float dFutureYearSalary = (float) dFutureMonthSalary * year;
        float kFutureYearSalary = (float) kFutureMonthSalary * year;

        float mYearSalaryDifference = (float) mFutureYearSalary - mCurrentYearSalary;
        float dYearSalaryDifference = (float) dFutureYearSalary - dCurrentYearSalary;
        float kYearSalaryDifference = (float) kFutureYearSalary - kCurrentYearSalary;

        System.out.println("Маша теперь получает " + mFutureMonthSalary + " рублей. Годовой доход вырос на " + mYearSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + dFutureMonthSalary + " рублей. Годовой доход вырос на " + dYearSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kFutureMonthSalary + " рублей. Годовой доход вырос на " + kYearSalaryDifference + " рублей.");

    }
}