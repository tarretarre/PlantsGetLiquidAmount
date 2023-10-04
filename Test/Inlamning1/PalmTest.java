package Inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm olof = new Palm("Olof", 1);
    Palm laura = new Palm("Laura", 5);

    @Test
    void getLiquidAmountCalculator() {
        assert(olof.getLiquidAmount() == 0.5);
        olof.setHeight(2);
        assert(!(olof.getLiquidAmount() == 0.5));
    }

    @Test
    void getHeight() {
        assert(olof.getHeight() == 1);
        olof.setHeight(4);
        assert(!(olof.getHeight() == 1));
    }

    @Test
    void getLiquidType() {
        assert(!(olof.getLiquidType().liquidType.equalsIgnoreCase("proteindryck")));
        assert(olof.getLiquidType().liquidType.equalsIgnoreCase("kranvatten"));
    }
}