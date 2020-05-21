package unit;

import coffeemachine.core.*;
import coffeemachine.core.drinks.Coffee;
import coffeemachine.core.drinks.Drink;
import coffeemachine.core.drinks.Tea;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CommandParserShould {

    CommandParser commandParser;

    @Before
    public void init(){
        commandParser = new CommandParser();
    }


    @Test
    public void parse_order_command_for_tea(){

        Drink tea = new Tea();

        assertEquals("T::",commandParser.parseDrink(tea));

    }

    @Test
    public void parse_order_command_for_tea_with_one_sugar(){

        Drink tea = new Tea().withSugar(1);

        assertEquals("T:1:0", commandParser.parseDrink(tea));

    }

    @Test
    public void parse_order_command_for_coffee_with_two_sugars(){

        Drink cofee = new Coffee().withSugar(2);


        assertEquals("C:2:0", commandParser.parseDrink(cofee));

    }


}
