package Inlamning1;

public class Palm extends Plant{ //Arv
    private final LiquidType liquidType = ILiquidRequirements.tapWater;

    public Palm() {}

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double getLiquidAmount() { //Polymorfism overriding överordnade klassers metoder med sin egen implementation baserat objektets behov
        return 0.5 * getHeight();
    }

    @Override
    public LiquidType getLiquidType() { //Polymorfism overriding överordnade klassers metoder med sin egen implementation baserat objektets behov
        return liquidType;
    }

    public String toString() {
        return printMe();
    }
}
