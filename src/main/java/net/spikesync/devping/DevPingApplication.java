package net.spikesync.devping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@ImportResource({"classpath*:beans.xml"}) //The file isn't read

@Configuration
@EnableAutoConfiguration
@ImportResource(locations = {"classpath:META-INF/spring/beans.xml"})

public class DevPingApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DevPingApplication.class);

    @Autowired 
    private Pojo pojo;
    
//    @Autowired
//    private NoClass noclass;

    public static void main(String[] args) {
        SpringApplication.run(DevPingApplication.class, args);
    }

    public void run(String... args) {
        logger.info(pojo.getField());
    }

}
