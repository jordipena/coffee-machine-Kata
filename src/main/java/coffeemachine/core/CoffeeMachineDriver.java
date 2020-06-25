package coffeemachine.core;

import coffeemachine.core.adapter.CoffeeMachineAdapter;

public class CoffeeMachineDriver implements CoffeeMaker, Console {

   private DrinkMaker maker;
   private CoffeeMachineAdapter coffeeMachineAdapter = new CoffeeMachineAdapter();
   private Double amount = 0.00;


    public CoffeeMachineDriver(DrinkMaker maker) {

        this.maker = maker;
    }

    @Override
    public void command(DrinkCommand command) {

        if(amount >= command.getDrinkLetter().getDrinkPrice()){
            maker.execute(coffeeMachineAdapter.adaptCommand(command));
        }
        display("Not enough money");
    }

    @Override
    public void display(String message) {
        maker.execute("M: "+message);
    }

    public void insertMoney(Double amount){
        this.amount += amount;
    }

}
