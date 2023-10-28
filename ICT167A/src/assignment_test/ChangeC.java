package assignment_test;

public class ChangeC {
    private String name;
    private int coinAmount;
    private int[] coinDenominations;

    public ChangeC(String name, int coinAmount) {
        this.name = name;
        this.coinAmount = coinAmount;
        this.coinDenominations = new int[]{1, 2, 5, 10, 20, 50, 100, 200};
    }

    public String getName() {
        return name;
    }

    public int getCoinAmount() {
        return coinAmount;
    }

    public int[] calculateChange() {
        int[] coinCounts = new int[coinDenominations.length];
        int remainingAmount = coinAmount;

        for (int i = coinDenominations.length - 1; i >= 0; i--) {
            coinCounts[i] = remainingAmount / coinDenominations[i];
            remainingAmount %= coinDenominations[i];
        }

        return coinCounts;
    }

    public void displayChange() {
        int[] coinCounts = calculateChange();

//        System.out.println("Customer: " + name + " " + coinAmount + " pence");
//        System.out.println("Change:");

        for (int i = coinDenominations.length - 1; i >= 0; i--) {
            if (coinCounts[i] > 0) {
                System.out.println(getDenominationString(coinDenominations[i]) + ": " + coinCounts[i]);
            }
        }
    }

    private String getDenominationString(int denomination) {
        if (denomination < 100) {
            return denomination + "p";
        } else {
            return "£" + (denomination / 100);
        }
    }
}

