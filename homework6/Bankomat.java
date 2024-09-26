package com.dmdev.lesson11.homework6;

public class Bankomat {

    private Integer count10;
    private Integer count20;
    private Integer count50;

    public void addMoney(int add10, int add20, int add50) {
        this.count10 += add10;
        this.count20 += add20;
        this.count50 += add50;
    }

    public boolean cashout(int sum) {

        if (sum <= 0) {
            System.out.println("Сумма должна быть больше 0");
            return (false);
        }

        if (sum %10 != 0) {
            System.out.println("Сумма должна быть кратна 10");
            return (false);
        }

        int amount50 = Math.min(sum/50, count50); //сравнивает максимальное и
        // данное количество купюр необходимых для выдачи суммы, выбирает и присваивает
        // минимальное из них
        sum -= 50*amount50;

        int amount20 = Math.min(sum/20, count20); // тот же шаг после того как выдали часть суммы по 50
        sum -= 20*amount20;

        int amount10 = Math.min(sum/10, count10);
        sum -= 10*amount10;

        if (sum > 0) {
            System.out.println("Недостаточно средств для вывода всей суммы");
            return false;
        }

        System.out.println("Выдано банкнот: " + amount50 + " шт. по 50 рублей, "
                + amount20 + " шт. по 20 рублей, "
                + amount10 + " шт. по 10 рублей.");

        return true;
    }

    public Bankomat(int count10, int count20, int count50) {
        this.count10 = count10;
        this.count20 = count20;
        this.count50 = count50;
    }

    public int getCount10() {
        return count10;
    }

    public int setCount10(int count10) {
        this.count10 = count10;
        return count10;
    }

    public int getCount20() {
        return count20;
    }

    public void setCount20(int count20) {
        this.count20 = count20;
    }

    public int getCount50() {
        return count50;
    }

    public void setCount50(int count50) {
        this.count50 = count50;
    }
}
