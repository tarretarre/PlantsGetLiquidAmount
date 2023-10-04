package Inlamning1;

public class Cactus extends Plant{
    private final LiquidType liquidType = ILiquidRequirements.mineralWater;

    public Cactus() {}

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double getLiquidAmount() {
        return 0.2;
    }

    @Override
    public LiquidType getLiquidType() {
        return liquidType;
    }

    public String toString() {
        return printMe();
    }
}
