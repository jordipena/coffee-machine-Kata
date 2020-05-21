package coffeemachine.core;

import coffeemachine.core.drinks.Drink;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachineRepository {

    private List<Drink> drinkList;

    public CoffeeMachineRepository(List<Drink> drinkList) {
        this.drinkList = new ArrayList<>();
    }
}
