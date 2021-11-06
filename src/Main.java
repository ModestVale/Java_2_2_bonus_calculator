public class Main {
    public static void main(String[] args) {
        double balance = 2000;
        double deposit_amount = 1500;
        double result_balance;
        int bonus_count = 0;

        if (deposit_amount > 1000) {
            bonus_count = (int) deposit_amount / 100;
        }

        result_balance = balance + deposit_amount + bonus_count;

        System.out.println("Result balance: " + result_balance);
        System.out.println("Bonus count: " + bonus_count);
    }
}