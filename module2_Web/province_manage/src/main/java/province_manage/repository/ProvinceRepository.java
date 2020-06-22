package province_manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import province_manage.model.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {
}
