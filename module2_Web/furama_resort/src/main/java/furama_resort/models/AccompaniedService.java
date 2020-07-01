package furama_resort.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accompaniedService")
public class AccompaniedService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccompaniedService;
    private String name;
    private Double cost;
    private String status;

    @OneToMany(mappedBy = "accompaniedServices")
    private Set<DetailContract> detailContract;

    public AccompaniedService() {
    }

    public Long getIdAccompaniedService() {
        return idAccompaniedService;
    }

    public void setIdAccompaniedService(Long idAccompaniedService) {
        this.idAccompaniedService = idAccompaniedService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<DetailContract> getDetailContract() {
        return detailContract;
    }

    public void setDetailContract(Set<DetailContract> detailContract) {
        this.detailContract = detailContract;
    }
}

