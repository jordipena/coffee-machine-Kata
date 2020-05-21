package coffeemachine.core.drinks;

import coffeemachine.core.DrinkValues;

public class Chocolate extends Drink {

    private static final String CODE = DrinkValues.CHOCOLATE.getDrinkCode();
    private static final String NAME = "Chocolate";

    public Chocolate() {
        super(NAME, CODE);
    }

}
