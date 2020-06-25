package coffeemachine.core.adapter;

import coffeemachine.core.DrinkCommand;

public class CoffeeMachineAdapter {

    public String adaptCommand(DrinkCommand command){

        StringBuilder instruction = new StringBuilder();
        instruction.append(command.getDrinkLetter().getDrinkCode());
        instruction.append(":");
        if(command.getNumberOfSugar() > 0){
            instruction.append(command.getNumberOfSugar());
            instruction.append(":");
            instruction.append("0");
        }
        else{
            instruction.append(":");
        }
        return instruction.toString();
    }

}
