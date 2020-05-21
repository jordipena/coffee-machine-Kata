package coffeemachine.core;

import coffeemachine.core.adapter.CoffeeMakerAdapter;

public class CoffeeMachine implements CoffeeMaker, Console {

   private DrinkMaker maker;
   private CoffeeMakerAdapter coffeeMakerAdapter = new CoffeeMakerAdapter();

    public CoffeeMachine(DrinkMaker maker) {

        this.maker = maker;
    }

    @Override
    public void command(DrinkCommand command) {
        maker.execute(coffeeMakerAdapter.adaptCommand(command));
    }

    @Override
    public void display(String message) {
        maker.execute("M: "+message);
    }
}
