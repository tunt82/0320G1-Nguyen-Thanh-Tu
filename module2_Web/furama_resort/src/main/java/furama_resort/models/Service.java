package furama_resort.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "service")
public class Service {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "service_id")
   private Long idService;

   @Column(name = "name_service")
   private String nameService;
   @Column(name = "area")
   private Long area;
   @Column(name = "floor")
   private Long floor;
   @Column(name = "max_number_people")
   private Long maxNumberPeople;
   @Column(name = "rental_cost")
   private Double rentalCost;
   @Column(name = "status")
   private String status;

   @OneToMany(mappedBy = "service")
   private Set<Contract> contract;

   @ManyToOne
   @JoinColumn(name = "id_rentType")
   private RentType rentType;

   @ManyToOne
   @JoinColumn(name = "id_service_type")
   private ServiceType serviceType;

   @ManyToOne
   @JoinColumn(name = "id_bookService")
   private BookService bookService;

    public Service() {
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getFloor() {
        return floor;
    }

    public void setFloor(Long floor) {
        this.floor = floor;
    }

    public Long getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(Long maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public Double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(Double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Contract> getContract() {
        return contract;
    }

    public void setContract(Set<Contract> contract) {
        this.contract = contract;
    }

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
