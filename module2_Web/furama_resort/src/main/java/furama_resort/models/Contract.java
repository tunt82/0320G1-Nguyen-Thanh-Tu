package furama_resort.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContract;

//    private Long idEmployee;
//    private Long idCustomer;

    @Column(name = "createContractDay")
    private Date createContractDay;

    @Column(name = "theEndContractDay")
    private Date theEndContractDay;

    @Column(name = "deposit")
    private Double deposit;

    @Column(name = "amountMoney")
    private Double amountMoney;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "service_id",nullable = false)
    private Service service;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "contract")
    private Set<DetailContract> detailContract;


    public Contract() {
    }

    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }

    public Date getCreateContractDay() {
        return createContractDay;
    }

    public void setCreateContractDay(Date createContractDay) {
        this.createContractDay = createContractDay;
    }

    public Date getTheEndContractDay() {
        return theEndContractDay;
    }

    public void setTheEndContractDay(Date theEndContractDay) {
        this.theEndContractDay = theEndContractDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(Double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
