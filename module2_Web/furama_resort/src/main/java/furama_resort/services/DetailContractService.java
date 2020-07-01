package furama_resort.services;

import furama_resort.models.DetailContract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DetailContractService {
    Page<DetailContract> findAllDetailContract(Pageable pageable);
}
