package coffeemachine.core.drinks;

import coffeemachine.core.DrinkValues;

public class Tea extends Drink {

    private static final String CODE = DrinkValues.TEA.getDrinkCode();
    private static final String NAME = "Tea";

    public Tea() {
        super(NAME, CODE);
    }

}
