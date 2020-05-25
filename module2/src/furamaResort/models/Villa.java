package furamaResort.models;

import java.util.Comparator;
import java.util.Objects;

public class Villa extends Services implements Comparable<Villa> {
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

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            if (!(o instanceof Villa)) return false;
            Villa villa = (Villa) o;
            return Double.compare(villa.poolArea, poolArea) == 0 &&
                    floorNumber == villa.floorNumber &&
                    roomStandard.equals(villa.roomStandard) &&
                    descriptionConvenient.equals(villa.descriptionConvenient);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roomStandard, descriptionConvenient, poolArea, floorNumber);
    }

    @Override
    public int compareTo(Villa o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
