package unit;

import coffeemachine.core.CoffeeMachine;
import coffeemachine.core.DrinkCommand;
import coffeemachine.core.DrinkMaker;
import coffeemachine.core.DrinkValues;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;


public class CoffeeMachineShould {

         CoffeeMachine coffeeMachine;
         DrinkMaker maker;

        @Before
        public void setUp(){
                maker = mock(DrinkMaker.class);
                coffeeMachine =  new CoffeeMachine(maker);
        }

        @Test
        public void display_a_message_to_the_user(){
                coffeeMachine.display("a message for the user");

                verify(maker).execute("M: a message for the user");

        }

        @Test
        public void display_a_command_for_a_chocolate_without_sugar(){
                coffeeMachine.command(new DrinkCommand(DrinkValues.CHOCOLATE,0));

                verify(maker).execute("H::");

        }

        @Test
        public void display_a_command_for_a_tea_with_1_sugar(){
                coffeeMachine.command(new DrinkCommand(DrinkValues.TEA,1));

                verify(maker).execute("T:1:0");
        }

        @Test
        public void display_a_command_for_a_coffee_with_2_sugar(){
                coffeeMachine.command(new DrinkCommand(DrinkValues.COFFEE,2));

                verify(maker).execute("C:2:0");
        }
}
