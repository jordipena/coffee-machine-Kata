package coffeemachine.core.drinks;

import coffeemachine.core.DrinkValues;

public class Coffee extends Drink {

    private static final String CODE = DrinkValues.COFFEE.getDrinkCode();
    private static final String COFFEE = "Coffee";


    public Coffee()
    {
        super(COFFEE, CODE);
    }



}
