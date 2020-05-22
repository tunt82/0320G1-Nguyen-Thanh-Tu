package furamaResort.models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionConvenient;
    private double poolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String id, String codeService, String nameService, int rentalArea, double rentalCost, int maximumNumberOfPeople, String typeOfRent, String roomStandard, String descriptionConvenient, double poolArea, int floorNumber) {
        super(id, codeService, nameService, rentalArea, rentalCost, maximumNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.descriptionConvenient = descriptionConvenient;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionConvenient() {
        return descriptionConvenient;
    }

    public void setDescriptionConvenient(String descriptionConvenient) {
        this.descriptionConvenient = descriptionConvenient;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }


    @Override
    public String ShowInfor() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                "descriptionConvenient='" + descriptionConvenient + '\'' +
                "poolArea='" + poolArea + '\'' +
                "floorNumber='" + floorNumber + '\'' +
                '}';
    }
}
