package net.spikesync.devping;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import net.spikesync.devping.Pojo;
import net.spikesync.devping.DevPingApplication;

import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@EnableAutoConfiguration
//@ImportResource({"classpath*:beans.xml"}) //The file isn't read
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DevPingApplication.class)
public class DevPingApplicationTest {

	@Autowired
	private Pojo pojo;
	@Value("${sample-value}")
	private String sample;

	@Test
	public void whenCallingGetter_thenPrintingProperty() {
		assertThat(pojo.getField()).isNotBlank().isEqualTo(sample);
	}

//    @Test
//    public void contextLoads(ApplicationContext context) {
//    	assertThat(context).isNotNull();
//    }

}