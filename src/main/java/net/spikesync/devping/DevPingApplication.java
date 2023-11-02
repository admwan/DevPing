package net.spikesync.devping;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource({"classpath*:beans.xml"}) //The file isn't read with this line!

@SpringBootConfiguration
@EnableAutoConfiguration
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class DevPingApplication { // implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DevPingApplication.class);

    @Autowired
    private SilverCloud sc;
    
    public static void main(String[] args) {
    	SpringApplication devPingApp = new SpringApplication(DevPingApplication.class);
    	logger.info("Starting DevPingApplication");
    	devPingApp.setDefaultProperties(Collections.singletonMap("server.port", "8098"));
        devPingApp.run(args);
    }

    public void run(String... args) {
        logger.info("SilverCloud nodes:    " + sc.getScNodes().toString());
        logger.info("EXECUTING : command line runner");
        
        for (int i = 0; i < args.length; ++i) {
            logger.info("args[{}]: {}", i, args[i]);
        }
    }
}
