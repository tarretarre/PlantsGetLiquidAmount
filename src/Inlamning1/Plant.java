package Inlamning1;

abstract class Plant implements ILiquidRequirements{
    private String plantName; //Inkapsling med publika metoder nedan för att ge åtkomst till och kunna justera variablerna
    private double height; //Inkapsling med publika metoder nedan för att ge åtkomst till och kunna justera variablerna

    public Plant() {}

    public Plant(String plantName, double height) {
        this.plantName = plantName;
        this.height = height;
    }

    public String getPlantName() {
        return plantName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getLiquidAmount() { //Polymorfism
        return 0;
    }

    public String printMe() {
        return "Plantan " + getPlantName()
                + "\nbehöver " + getLiquidAmount() + " liter\n"
                + getLiquidType().liquidType + " om dagen."; //Polymorfism
    }
}
