package Inlamning1;

public interface ILiquidRequirements {
    double getLiquidAmount(); //metod som måste implementeras av de klasser som implementerar interfacet
    LiquidType getLiquidType(); //metod som måste implementeras av de klasser som implementerar interfacet
    LiquidType mineralWater = LiquidType.MINERALWATER;
    LiquidType tapWater = LiquidType.TAPWATER;
    LiquidType proteinDrink = LiquidType.PROTEINDRINK;
}
