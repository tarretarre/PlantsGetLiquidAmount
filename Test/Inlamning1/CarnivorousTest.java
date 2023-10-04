package Inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {
    Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);

    @Test
    void getLiquidAmountCalculator() {
        assert(meatloaf.getLiquidAmount() == 0.24);
        meatloaf.setHeight(2);
        assert(!(meatloaf.getLiquidAmount() == 0.24));
    }

    @Test
    void getHeight() {
        assert(meatloaf.getHeight() == 0.7);
        meatloaf.setHeight(4);
        assert(!(meatloaf.getHeight() == 0.7));
    }

    @Test
    void getLiquidType() {
        assert(meatloaf.getLiquidType().liquidType.equalsIgnoreCase("proteindryck"));
        assert(!(meatloaf.getLiquidType().liquidType.equalsIgnoreCase("kranvatten")));
    }
}