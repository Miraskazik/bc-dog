package cz.rb.bcdog.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("cz.rb.bcdog")
@EnableWebMvc
public class Config implements WebMvcConfigurer {
}
