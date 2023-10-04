package Inlamning1;

public class Carnivorous extends Plant{
    private final LiquidType liquidType = ILiquidRequirements.proteinDrink;

    public Carnivorous() {}

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double getLiquidAmount() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public LiquidType getLiquidType() {
        return liquidType;
    }

    public String toString() {
        return printMe();
    }
}
