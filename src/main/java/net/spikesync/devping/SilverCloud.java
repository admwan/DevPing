package net.spikesync.devping;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;


public class SilverCloud {

	private HashMap<String, String> scNodes;

	public SilverCloud(HashMap<String, String> scN) {
		this.scNodes = scN;

	}
	
	public HashMap<String,String> getScNodes() { return this.scNodes; }
}
