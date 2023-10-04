package Inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus igge = new Cactus("Igge", 0.2);

    @Test
    void getLiquidAmountCalculator() {
        assert(igge.getLiquidAmount() == 0.2);
        igge.setHeight(4);
        assert(igge.getLiquidAmount() == 0.2);
    }

    @Test
    void getHeight() {
        assert(igge.getHeight() == 0.2);
        igge.setHeight(4);
        assert(!(igge.getHeight() == 0.2));
    }

    @Test
    void getLiquidType() {
        assert(!(igge.getLiquidType().liquidType.equalsIgnoreCase("proteindryck")));
        assert(igge.getLiquidType().liquidType.equalsIgnoreCase("mineralvatten"));
    }
}