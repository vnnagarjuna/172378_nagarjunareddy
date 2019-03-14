package com.rest.Rest.resources;



import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.Rest.model.Message;
import com.rest.Rest.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/message")
public class MessageResources {

	
	MessageService service=new MessageService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List <Message> getMessage() {
        return service.getAllMessages();
    }
}


