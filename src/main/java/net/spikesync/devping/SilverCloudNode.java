package net.spikesync.devping;

public class SilverCloudNode {
	
	private String nodeName;
	private String ipAddress;
	
	public SilverCloudNode(String name, String address) {
		this.nodeName = name;
		this.ipAddress = address;
	}
	public String getNodeName() {
		return this.nodeName;
	}
	
	public String getIpAddress() {
		return this.ipAddress;
	}
}
