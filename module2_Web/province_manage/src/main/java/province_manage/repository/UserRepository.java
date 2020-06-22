package province_manage.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import province_manage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value ="select * from user c where c.is_delete=false" ,nativeQuery = true)
    Page<User> findAllUer(Pageable pageable);

//    Page<User> findAllByIs_deleteIsFalseAndNameContaining(Pageable pageable, String s);

}
