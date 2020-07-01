package furama_resort.repositorys;

import furama_resort.models.DetailContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailContractRepository extends JpaRepository<DetailContract,Long> {
}
