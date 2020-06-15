package jk.om.common.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpringFoxConfig.class)
public class AppCommonConfig {

//	@Bean(initMethod = "init")
//	public InitMethodExampleBean exBean() {
//		return new InitMethodExampleBean();
//	}

}
