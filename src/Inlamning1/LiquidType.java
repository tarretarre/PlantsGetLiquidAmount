package Inlamning1;

public enum LiquidType {
    MINERALWATER ("mineralvatten"),
    TAPWATER ("kranvatten"),
    PROTEINDRINK ("proteindryck");

    public final String liquidType;

    LiquidType(String lt) {
        liquidType = lt;
    }
}
