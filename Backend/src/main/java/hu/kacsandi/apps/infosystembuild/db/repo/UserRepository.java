package hu.kacsandi.apps.infosystembuild.db.repo;

import hu.kacsandi.apps.infosystembuild.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

        //    Mesés, csodás SLQ-ek helye
    @Query("SELECT u FROM UserEntity u WHERE u.roles = 'USER'")
    List<UserEntity> getAllUser(String users);


    @Query("SELECT u FROM UserEntity u WHERE u.roles = 'ADMIN'")
    List<UserEntity> getAllAdmin(String users);


}
