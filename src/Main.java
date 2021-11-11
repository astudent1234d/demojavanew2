public class Main {
    public static void main(String[] args) {
        int initialAccount = 500;
        int replenishmentAmount = 1500;
        boolean condition = true;
        condition = replenishmentAmount > 1000;
        int amountOfBonuses;
        if (condition) {
            amountOfBonuses = replenishmentAmount / 100;
        } else {
            amountOfBonuses = 0;
        }
        int totalScore = initialAccount + replenishmentAmount;
        System.out.println(totalScore);
        System.out.println(amountOfBonuses);
    }
}