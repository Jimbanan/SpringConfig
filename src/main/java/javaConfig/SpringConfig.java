package javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("javaConfig")
@PropertySource("musicPLayer.properties")
public class SpringConfig {



}
