package coffeemachine.core;

public class DrinkCommand {

    private DrinkValues drinkValues;
    private int numberOfSugar = 0;

    public DrinkCommand(DrinkValues drinkValues, int numberOfSugar) {
        this.drinkValues = drinkValues;
        this.numberOfSugar = numberOfSugar;
    }

    public DrinkValues getDrinkLetter() {
        return drinkValues;
    }

    public int getNumberOfSugar(){
        return numberOfSugar;
    }
}
