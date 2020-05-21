package coffeemachine.core;

public enum DrinkValues {
    TEA("T",0.4),
    CHOCOLATE("H", 0.5),
    COFFEE("C", 0.6);

    private String drinkCode;
    private Double drinkPrice;

    DrinkValues(String drinkCode, Double drinkPrice)
    {
        this.drinkCode = drinkCode;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkCode(){
        return drinkCode;
    }
    public Double getDrinkPrice() {
        return drinkPrice;
    }
}
