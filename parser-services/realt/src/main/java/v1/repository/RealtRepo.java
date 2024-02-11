package v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import v1.domain.flatDao.FlatDao;

import java.util.Optional;

@Repository
public interface RealtRepo extends JpaRepository<FlatDao, Long> {

    Optional<FlatDao> findByUrl(String url);

}
