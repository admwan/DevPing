package net.spikesync.devping;

import org.junit.jupiter.api.Test;
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

	@Autowired
	private Pojo pojo;
	@Value("${sample-value}")
	private String sample;
	@Autowired
	private SilverCloud sc;

	@Test
	public void whenCallingGetter_thenPrintingProperty() {
		assertThat(pojo.getField()).isNotBlank().isEqualTo(sample);
	}

    @Test
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
    
}