package coffeemachine.core;

import coffeemachine.core.drinks.Drink;

public class CommandParser {

    public final static String SEPARATOR = ":";
    public final static String DOUBLE_SEPARATOR = "::";


    public String parseDrink(Drink drink) {

        String commnad = "";

        if(drink.hasSugar()){

            commnad = formattedMessage(drink);
        }
        else{
            commnad = drink.code + DOUBLE_SEPARATOR;
        }


        return commnad;
    }


    private String formattedMessage(Drink drink) {
        return drink.code+ SEPARATOR + drink.numberOfSugar + SEPARATOR + 0;
    }
}
