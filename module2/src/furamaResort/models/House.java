package furamaResort.models;

public class House extends Services {
    private String roomStandard;
    private String descriptionConvenient;
    private int floorNumber;

    public House() {
    }

    public House(String id, String codeService, String nameService, int rentalArea, double rentalCost, int maximumNumberOfPeople, String typeOfRent, String roomStandard, String descriptionConvenient, int floorNumber) {
        super(id, codeService, nameService, rentalArea, rentalCost, maximumNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.descriptionConvenient = descriptionConvenient;
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

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String ShowInfor() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                "descriptionConvenient='" + descriptionConvenient + '\'' +
                "floorNumber='" + floorNumber + '\'' +
                '}';
    }

}
