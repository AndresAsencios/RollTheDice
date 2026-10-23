package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for(int i = 100; i >= 1; i--) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int total = roll1 + roll2;

            System.out.println(" Roll" +(101 - i) +":  " + roll1 + " - " + roll2 + "  Sum: " + total);

            if (total == 2) {
                count2++;
            } else if (total == 4){
                count4++;
            } else if (total == 6) {
                count6++;
            } else if (total == 7) {
                count7++;
            }
        }

        System.out.println();
        System.out.println("Total times 2 was rolled: " + count2);
        System.out.println("Total times 4 was rolled: " + count4);
        System.out.println("Total times 6 was rolled: " + count6);
        System.out.println("Total times 7 was rolled: " + count7);

    }
}
