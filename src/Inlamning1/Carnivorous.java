package Inlamning1;

public class Carnivorous extends Plant{ //Arv
    private final LiquidType liquidType = ILiquidRequirements.proteinDrink;

    public Carnivorous() {}

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double getLiquidAmount() { //Polymorfism overriding överordnade klassers metoder med sin egen implementation baserat objektets behov
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public LiquidType getLiquidType() { //Polymorfism overriding överordnade klassers metoder med sin egen implementation baserat objektets behov
        return liquidType;
    }

    public String toString() {
        return printMe();
    }
}
