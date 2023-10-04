package Inlamning1;

public interface ILiquidRequirements {
    double getLiquidAmount();
    LiquidType getLiquidType();
    LiquidType mineralWater = LiquidType.MINERALWATER;
    LiquidType tapWater = LiquidType.TAPWATER;
    LiquidType proteinDrink = LiquidType.PROTEINDRINK;
}
