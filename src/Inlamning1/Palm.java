package Inlamning1;

public class Palm extends Plant{
    private final LiquidType liquidType = ILiquidRequirements.tapWater;

    public Palm() {}

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double getLiquidAmount() {
        return 0.5 * getHeight();
    }

    @Override
    public LiquidType getLiquidType() {
        return liquidType;
    }

    public String toString() {
        return printMe();
    }
}
