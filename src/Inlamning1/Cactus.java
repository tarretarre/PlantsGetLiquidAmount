package Inlamning1;

public class Cactus extends Plant{ //Arv
    private final LiquidType liquidType = ILiquidRequirements.mineralWater;

    public Cactus() {}

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double getLiquidAmount() { //Polymorfism overriding överordnade klassers metoder med sin egen implementation baserat objektets behov
        return 0.02;
    }

    @Override
    public LiquidType getLiquidType() { //Polymorfism overriding överordnade klassers metoder med sin egen implementation baserat objektets behov
        return liquidType;
    }

    public String toString() {
        return printMe();
    }
}
