package hu.kacsandi.apps.infosystembuild.db.repo;

import hu.kacsandi.apps.infosystembuild.db.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {

    //    Mesés, csodás SLQ-ek helye
}
