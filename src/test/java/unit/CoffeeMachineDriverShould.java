package unit;

import coffeemachine.core.CoffeeMachineDriver;
import coffeemachine.core.DrinkCommand;
import coffeemachine.core.DrinkMaker;
import coffeemachine.core.DrinkValues;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;


public class CoffeeMachineDriverShould {

         CoffeeMachineDriver coffeeMachineDriver;
         DrinkMaker maker;

        @Before
        public void setUp(){
                maker = mock(DrinkMaker.class);
                coffeeMachineDriver =  new CoffeeMachineDriver(maker);
        }

        @Test
        public void display_a_message_to_the_user(){
                coffeeMachineDriver.display("a message for the user");

                verify(maker).execute("M: a message for the user");

        }

        @Test
        public void display_a_command_for_a_chocolate_without_sugar(){
                coffeeMachineDriver.insertMoney(1.00);

                coffeeMachineDriver.command(new DrinkCommand(DrinkValues.CHOCOLATE,0));

                verify(maker).execute("H::");

        }

        @Test
        public void display_a_command_for_a_tea_with_1_sugar(){
                coffeeMachineDriver.insertMoney(1.00);

                coffeeMachineDriver.command(new DrinkCommand(DrinkValues.TEA,1));

                verify(maker).execute("T:1:0");
        }

        @Test
        public void display_a_command_for_a_coffee_with_2_sugar(){
                coffeeMachineDriver.insertMoney(1.00);

                coffeeMachineDriver.command(new DrinkCommand(DrinkValues.COFFEE,2));

                verify(maker).execute("C:2:0");
        }

        @Test
        public void display_a_command_for_a_drink_when_there_is_enough_money(){

                coffeeMachineDriver.insertMoney(0.60);
                coffeeMachineDriver.command(new DrinkCommand(DrinkValues.COFFEE,2));

                verify(maker).execute("C:2:0");
        }

        @Test
        public void display_a_message_to_the_when_there_is_not_enough_money(){

                coffeeMachineDriver.insertMoney(0.30);
                coffeeMachineDriver.command(new DrinkCommand(DrinkValues.COFFEE,2));

                verify(maker).execute("M: Not enough money");
        }
}

