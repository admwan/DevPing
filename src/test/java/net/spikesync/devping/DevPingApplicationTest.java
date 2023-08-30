package net.spikesync.devping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DevPingApplication.class)
public class DevPingApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(DevPingApplication.class);

	@Autowired
	private SilverCloud sc;
	@Value("${test-silvercloud-scnodes}")
	private String testingEnabled;


    @Test
    @EnabledIf("testingEnabled")
    public void silverCloudTest(ApplicationContext context) {
 
    	// this.sc is Autowired, so it is ready for testing!
    	assertThat(sc.getScNodes())
    			.isNotEmpty()
    			.containsEntry("SURFIE","192.168.50.100")
    			.containsEntry("CAPTUW","192.168.50.104")
    			.containsEntry("THORFW","192.168.50.107")
    			.containsEntry("LOKIFS","192.168.50.110")
    			.containsEntry("SCARFS","192.168.50.113")
    			.containsEntry("ASGAFS","192.168.50.119")
    			.containsEntry("HYDRFS","192.168.50.116");
    }
    
    private boolean testingEnabled() {
    	logger.info("In method DevPingApplicationTest.testingEnabled() with this.testingEnabled = " + this.testingEnabled);
    	if (this.testingEnabled.equals("true")) 
    		return Boolean.TRUE;
    	else return Boolean.FALSE; 
    }
}