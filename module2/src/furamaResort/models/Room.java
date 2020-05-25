package furamaResort.models;

import java.util.Objects;

public class Room extends Services implements Comparable<Room> {
    private String freeService;

    public Room() {
    }

    public Room(String id, String codeService, String nameService, int rentalArea, double rentalCost, int maximumNumberOfPeople, String typeOfRent, String freeService) {
        super(id, codeService, nameService, rentalArea, rentalCost, maximumNumberOfPeople, typeOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }




    @Override
    public String ShowInfor() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return freeService.equals(room.freeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeService);
    }

    @Override
    public int compareTo(Room o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
