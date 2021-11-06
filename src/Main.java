public class Main {
    public static void main(String[] args) {
        int initial_account = 500;
        int replenishment_amount = 1500;
        boolean condition = true;
        condition = replenishment_amount > 1000;
        int amount_of_bonuses;
        if (condition) {
            amount_of_bonuses = replenishment_amount / 100;
        } else {
            amount_of_bonuses = 0;
        }
        int Total_score = initial_account + replenishment_amount;
        System.out.println(Total_score);
        System.out.println(amount_of_bonuses);

    }
}