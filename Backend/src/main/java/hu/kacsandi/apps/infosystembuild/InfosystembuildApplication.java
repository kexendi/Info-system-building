package hu.kacsandi.apps.infosystembuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("hu.kacsandi.apps.infosystembuild.db.repo")
@EntityScan("hu.kacsandi.apps.infosystembuild.db.entity")
public class InfosystembuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfosystembuildApplication.class, args);
    }

}
