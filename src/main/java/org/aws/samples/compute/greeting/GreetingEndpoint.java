package org.aws.samples.compute.greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.ClientErrorException;
import java.util.Random;

/**
 * @author Arun Gupta
 */
@Path("greeting")
public class GreetingEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        // Generate timeout
        Random rand = new Random();
        int  n = rand.nextInt(200) + 1;

        String response = "Hello";

        if (n <= 180) {
          return response;
        } else {
          if ((n % 2) == 0) {
            throw new ServiceUnavailableException(30L);
          } else {
            throw new ClientErrorException(403);
          }
        }
    }
}
