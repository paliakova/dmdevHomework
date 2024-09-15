package com.dmdev.cs.homework2;

/**
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию
 * Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера,
 * чтобы инвестировать в акции с доходностью 2% в месяц.

 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.

 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {
    public static void main(String[] args) {

        int startSalary = 600;
        int monthlyExpenses = 300;
        int sixMonthRaise = 400;
        int monthOfWork = 38;
        double stockReturn = 0.02;
        System.out.println("Total broker is " +
                totalBrokerAccount(startSalary, sixMonthRaise, monthOfWork, stockReturn));
        System.out.println("Total savings is " +
                totalOwnAccount(startSalary, monthlyExpenses, sixMonthRaise, monthOfWork));


    }

    private static double totalBrokerAccount(int startSalary, int sixMonthRaise,
                                             int monthOfWork, double stockReturn) {

        int month = 1;
        int additionalSalaryIndex = 0;
        double brokerAmount = 0;

        while (month <= monthOfWork - 1) {

            if (month % 6 == 1 && month > 6) {
                additionalSalaryIndex ++;}

            int currentSalary = startSalary + (additionalSalaryIndex * sixMonthRaise);

            double brokerCurrentMonth = (double) currentSalary / 10 * stockReturn;

            month ++;
            brokerAmount = brokerAmount + brokerCurrentMonth;
        }

        return brokerAmount;
    }

    private static double totalOwnAccount(int startSalary, int monthlyExpenses, int sixMonthRaise,
                                          int monthOfWork) {

        int month = 1;
        int additionalSalaryIndex = 0;
        double savingsAmount = 0;

        while (month <= monthOfWork) {

            if (month % 6 == 1 && month > 6) {
                additionalSalaryIndex ++;
            }

            int currentSalary = startSalary + (additionalSalaryIndex * sixMonthRaise);

            double savingsCurrentMonth = currentSalary - monthlyExpenses  // этот блок тут должен стоять?
                    - (0.1 * currentSalary);

            month ++;
            savingsAmount += + savingsCurrentMonth;
        }
        return savingsAmount;
    }


}
