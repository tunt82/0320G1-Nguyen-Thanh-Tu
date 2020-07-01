package furama_resort.repositorys;

import furama_resort.models.Contract;
import furama_resort.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value ="select * from customer c where c.is_delete=true" ,nativeQuery = true)
    Page<Customer>findAllCustomer(Pageable pageable);

//    @Query(value ="select * from customer c where c.is_delete=true and c.name= ?" ,nativeQuery = true)
    Page<Customer>findAllByIsDeleteIsTrueAndNameContainingAndTypeCustomerContaining(@Param("s") String s, String type, Pageable pageable);

//    @Query(value = "select *  from customer inner join contract on customer_id =customer.id " +
//                   "where contract.createContractDay between 's' and 'e'",nativeQuery = true)
//    Page<Customer>findAllCustomerUseService(Date s, Date e, Pageable pageable);

    Page<Customer> findAllByContractCreateContractDay_CreateContractDayBetween(Date s, Date e, Pageable pageable);

}
