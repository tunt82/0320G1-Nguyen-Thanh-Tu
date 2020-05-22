package furamaResort.models;

public class Room extends Services {
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
}
