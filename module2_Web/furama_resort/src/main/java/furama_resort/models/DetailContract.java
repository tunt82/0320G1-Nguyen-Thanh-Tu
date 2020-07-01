package furama_resort.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "detailContract")
public class DetailContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "idContract")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_accompaniedServices")
    private AccompaniedService accompaniedServices;

    public DetailContract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AccompaniedService getAccompaniedServices() {
        return accompaniedServices;
    }

    public void setAccompaniedServices(AccompaniedService accompaniedServices) {
        this.accompaniedServices = accompaniedServices;
    }
}
