package furamaResort.models;

public abstract class Services {
    private String id;
    private String codeService;
    private String nameService;
    private int rentalArea;
    private double rentalCost;
    private int maximumNumberOfPeople;
    private String typeOfRent;


    public Services() {
    }

    public Services(String id, String codeService, String nameService, int rentalArea, double rentalCost, int maximumNumberOfPeople, String typeOfRent) {
        this.id = id;
        this.codeService = codeService;
        this.nameService = nameService;
        this.rentalArea = rentalArea;
        this.rentalCost = rentalCost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getRentalArea() {
        return rentalArea;
    }

    public void setRentalArea(int rentalArea) {
        this.rentalArea = rentalArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public abstract String ShowInfor();

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", rentalArea=" + rentalArea +
                ", rentalCost=" + rentalCost +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", typeOfRent='" + typeOfRent + '\''+", ";
    }
}
