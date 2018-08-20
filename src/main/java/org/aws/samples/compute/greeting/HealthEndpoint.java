package org.aws.samples.compute.greeting;

import com.amazonaws.xray.AWSXRay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.ClientErrorException;
import java.util.Random;

/**
 * @author Christoph Kassen
 */
@Path("health")
public class HealthEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(HealthEndpoint.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        logger.info("get");
        String response = "OK";

        return response;
    }
}
