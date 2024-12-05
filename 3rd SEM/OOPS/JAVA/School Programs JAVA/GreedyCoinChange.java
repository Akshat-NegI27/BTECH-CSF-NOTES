import java.util.Arrays;

public class GreedyCoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25}; // Coin denominations (in cents)
        int amount = 63; // The amount to make change for (in cents)

        int[] change = greedyCoinChange(coins, amount);

        if (change != null) {
            System.out.println("Minimum coins needed: " + change.length);
            System.out.println("Change: " + Arrays.toString(change));
        } else {
            System.out.println("Change not possible with the given coins.");
        }
    }

    public static int[] greedyCoinChange(int[] coins, int amount) {
        int[] change = new int[coins.length];
        Arrays.sort(coins);

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                change[i]++;
                amount -= coins[i];
            }
        }

        if (amount == 0) {
            int totalCoins = Arrays.stream(change).sum();
            int[] result = new int[totalCoins];
            int index = 0;

            for (int i = 0; i < coins.length; i++) {
                for (int j = 0; j < change[i]; j++) {
                    result[index] = coins[i];
                    index++;
                }
            }

            return result;
        } else {
            return null; // Change not possible
        }
    }
}