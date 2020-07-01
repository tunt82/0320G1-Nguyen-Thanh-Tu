package furama_resort.services.impl;

import furama_resort.models.DetailContract;
import furama_resort.repositorys.DetailContractRepository;
import furama_resort.services.DetailContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DetailContractServiceImpl implements DetailContractService {
    @Autowired
    DetailContractRepository detailContractRepository;
    @Override
    public Page<DetailContract> findAllDetailContract(Pageable pageable) {
        return detailContractRepository.findAll(pageable);
    }
}
