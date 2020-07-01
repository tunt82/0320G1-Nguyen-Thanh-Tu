package furama_resort.repositorys;

import furama_resort.models.Contract;
import furama_resort.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Long> {
    Page<Contract> findAllByIsDeleteIsTrue(Pageable pageable);
    Page<Contract> findAllByIsDeleteIsTrueAndTheEndContractDayBetween(Date s, Date e, Pageable pageable);
}
