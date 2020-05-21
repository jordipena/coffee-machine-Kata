package coffeemachine.core.drinks;

public abstract class Drink {

    public int numberOfSugar;
    public String name;
    public String code;

    public Drink(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Drink withSugar(int numberOfSugar){
        this.numberOfSugar = numberOfSugar;
        return this;
    }

    public boolean hasSugar(){

        if(numberOfSugar > 0){

            return true;
        }
        return false;
    }

}
