package net.spikesync.devping.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DevPingController {
    private final Logger logger = LoggerFactory.getLogger(DevPingController.class);

    @GetMapping("/")
    public String index() {
    	logger.debug("*************** Now in DevPingController ******* ONLY GETS CALLED WHEN WEBPAGE IS REQUESTED!!! ");
        //return "request-pinger-matrix.html";
    	return "schome.html";
    }

}