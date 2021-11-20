public class Main {
    public static void main(String[] args) {
        double balance = 2000;
        double depositAmount = 1500;
        double resultBalance;
        int bonusCount = 0;

        if (depositAmount > 1000) {
            bonusCount = (int) depositAmount / 100;
        }

        resultBalance = balance + depositAmount + bonusCount;

        System.out.println("Result balance: " + resultBalance);
        System.out.println("Bonus count: " + bonusCount);
    }
}