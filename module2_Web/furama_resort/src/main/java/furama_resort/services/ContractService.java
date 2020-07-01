package furama_resort.services;

import furama_resort.models.Contract;
import furama_resort.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.util.List;

public interface ContractService {
    void saveContract(Contract contract);

    List<Contract> getAllContract();

    Page<Contract> findAllContract(Pageable pageable, Date s, Date e);

    Page<Contract> findAllCustomerUsingServiceByTheEndContractDayBetween(Date s,Date e,Pageable pageable);

    void deleteContractById(Long id);


    Contract findContractById(Long id);
}
