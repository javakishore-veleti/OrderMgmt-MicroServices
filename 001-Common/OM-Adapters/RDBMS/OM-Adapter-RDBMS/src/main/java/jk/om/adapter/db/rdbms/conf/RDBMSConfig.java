package jk.om.adapter.db.rdbms.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ConditionalOnProperty(name = "OM.ADAPTER.RDBMS.ENABLED", havingValue = "true")
@Configuration
@EnableJpaRepositories(basePackages = "jk.om.adapter.db.rdbms.dao")
public class RDBMSConfig {

}
