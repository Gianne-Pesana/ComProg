package org.GiannePesana;

public class Farmer extends Tribemen{
    double fieldSize;
    String cropType;

    public Farmer() {
    }

    public Farmer(double fieldSize, String cropType) {
        this.fieldSize = fieldSize;
        this.cropType = cropType;
    }

    public Farmer(String name, String tribe, double fieldSize, String cropType) {
        super(name, tribe);
        this.fieldSize = fieldSize;
        this.cropType = cropType;
    }

    public double getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(double fieldSize) {
        this.fieldSize = fieldSize;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = Displays.toProperCase(cropType);
    }

    @Override
    public String introduction() {
        return "I am a farmer named " + name + " I belong to a tribe " + tribe +
                "I have a field size of " + fieldSize + " and I have a crop type of " + cropType;
    }
}
