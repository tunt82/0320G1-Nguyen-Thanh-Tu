package furama_resort.services.impl;

import furama_resort.models.Contract;
import furama_resort.models.Customer;
import furama_resort.repositorys.ContractRepository;
import furama_resort.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;
    @Override
    public void saveContract(Contract contract) {
        contract.setDelete(true);
        contractRepository.save(contract);
    }

    @Override
    public List<Contract> getAllContract() {
        return contractRepository.findAll();
    }

    @Override
    public Page<Contract> findAllContract(Pageable pageable, Date s, Date e) {
//        return contractRepository.findAllByIsDeleteIsTrue(pageable);
        return contractRepository.findAllByIsDeleteIsTrueAndTheEndContractDayBetween(s,e,pageable);
    }

    @Override
    public Page<Contract> findAllCustomerUsingServiceByTheEndContractDayBetween(Date s, Date e, Pageable pageable) {
        return contractRepository.findAllByIsDeleteIsTrueAndTheEndContractDayBetween(s, e, pageable);
    }

    @Override
    public void deleteContractById(Long id) {
        Contract contract=contractRepository.findById(id).orElse(null);
        if (contract!=null){
            contract.setDelete(false);
            contractRepository.save(contract);
        }

    }

    @Override
    public Contract findContractById(Long id) {
        return contractRepository.findById(id).orElse(null);
    }
}
