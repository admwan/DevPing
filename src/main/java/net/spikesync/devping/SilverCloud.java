package net.spikesync.devping;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

public class SilverCloud {

	private HashMap<SilverCloudNode, String> scNodes;

	public SilverCloud(HashMap<SilverCloudNode, String> scN) {
		this.scNodes = scN;

	}

	public HashMap<SilverCloudNode, String> getScNodes() {
		return this.scNodes;
	}

	public static enum SilverCloudNode {
		SURFIE, CAPTUW, THORFW, LOKIFS, SCARFS, HYDRFS, ASGAFS
	}
}
