package home_work2;

/**
 Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 300$ в месяц Ваня тратит на еду и развлечения.
 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.

 Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
*/

public class Task3 {

    public static void main(String[] args) {

        double startSalary = 600;
        double brokerAccount = 0;
        double bankAccount = 0;

        for (int i = 1; i <= 7; i++) {
            for(int j=1; j<=6; j++) {
                if(i==7 && j > 2) {
                    break;
                }
                brokerAccount += startSalary * 0.1 * 0.02;
                bankAccount += startSalary - 300;
            }
            startSalary += 400;
        }

        System.out.println("BankAccount: " + bankAccount);
        System.out.println("BrokerAccount: " + brokerAccount);
    }
}
