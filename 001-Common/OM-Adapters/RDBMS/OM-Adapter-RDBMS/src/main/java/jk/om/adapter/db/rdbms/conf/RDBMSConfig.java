package jk.om.adapter.db.rdbms.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ConditionalOnProperty(name = "om.adapter.rdbms.enabled", havingValue = "true")
@Configuration
@EnableJpaRepositories(basePackages = "jk.om.adapter.db.rdbms.dao")
@EntityScan( basePackages = {"jk.om.adapter.db.rdbms.model"} )
public class RDBMSConfig {

}
