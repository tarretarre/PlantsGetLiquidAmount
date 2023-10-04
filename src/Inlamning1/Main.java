package Inlamning1;

import javax.swing.*;

public class Main {
    Cactus igge = new Cactus("Igge", 0.2);
    Palm laura = new Palm("Laura", 5);
    Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);
    Palm olof = new Palm("Olof", 1);

    Plant[] plants = {igge, laura, meatloaf, olof};

    Main() {
        int option = JOptionPane.YES_OPTION;

        do {
            String inputNameOfPlant = JOptionPane.showInputDialog(null,
                    "Vilken växt vill du vattna?");

            try {
                String nameOfPlant = inputNameOfPlant.toUpperCase();

                boolean plantAvailable = false;

                for (Plant pn : plants) {
                    if (pn.getPlantName().equalsIgnoreCase(nameOfPlant)) {
                        JOptionPane.showMessageDialog(null, pn);
                        plantAvailable = true;
                        break;
                    }
                }

                if (!plantAvailable) {
                    JOptionPane.showMessageDialog(null, "Du måste ange namn på aktuella " +
                                "växter som finns på hotellet.");
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Program avslutat.");
                break;
            }
        } while (option == JOptionPane.YES_OPTION);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
