package utils;

import java.util.Random;

public final class VirtualDices {

    private final int MIN_DICE_VALUE = 1;

    private int dicesDropped[];

    private VirtualDices(){

    }

    public VirtualDices (int numberOfDices, int kindOfDice){


        Random random = new Random();
        dicesDropped = random.ints(numberOfDices, MIN_DICE_VALUE, kindOfDice)
                .toArray();

    }

    public int[] getDicesDropped() {
        return dicesDropped;
    }

    public void setDicesDropped(int[] dicesDropped) {
        this.dicesDropped = dicesDropped;
    }
}
