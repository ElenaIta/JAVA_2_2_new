public class Main {
    public static void main(String[] args) {
        int remainder = 122; //остаток на счете
        int payment = 1110; //сумма пополнения счета
        int bonus = 100; // 1 бонус=100руб


        // логика
        int totalBonus = payment / bonus; //начисленные бонусы
        int totalAccount = totalBonus + remainder + payment; //итоговый счет с бонусами
        int totalNoBonus = remainder + payment;

        if (payment >= 1001) {
            System.out.println(totalAccount);
            System.out.println(totalBonus);
        } else {
            System.out.println(totalNoBonus);
        }
        if (payment < 1001) {
            bonus = 0;
            System.out.println(bonus = 0);
        }
    }
}