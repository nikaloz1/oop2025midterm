package t3;

public class Vehicle {
    private String plateNumber;
    private String type;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{plateNumber='" + plateNumber + "', type='" + type + "'}";
    }
} 
