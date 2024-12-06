package cz.rb.bcdog.configuration;

import cz.rb.projectcommon.config.CommonConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("cz.rb.bcdog")
@EnableWebMvc
@Import({
        CommonConfig.class
})
public class Config {
}
