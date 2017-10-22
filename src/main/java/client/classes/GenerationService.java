
package client.classes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GenerationService", targetNamespace = "http://messageReceiver.messaging/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GenerationService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns client.classes.GenerationResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generatePatientsWithOptions", targetNamespace = "http://messageReceiver.messaging/", className = "client.classes.GeneratePatientsWithOptions")
    @ResponseWrapper(localName = "generatePatientsWithOptionsResponse", targetNamespace = "http://messageReceiver.messaging/", className = "client.classes.GeneratePatientsWithOptionsResponse")
    @Action(input = "http://messageReceiver.messaging/GenerationService/generatePatientsWithOptionsRequest", output = "http://messageReceiver.messaging/GenerationService/generatePatientsWithOptionsResponse")
    public GenerationResponse generatePatientsWithOptions(
        @WebParam(name = "arg0", targetNamespace = "")
        Demographic arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Boolean arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns client.classes.GenerationResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generatePatients", targetNamespace = "http://messageReceiver.messaging/", className = "client.classes.GeneratePatients")
    @ResponseWrapper(localName = "generatePatientsResponse", targetNamespace = "http://messageReceiver.messaging/", className = "client.classes.GeneratePatientsResponse")
    @Action(input = "http://messageReceiver.messaging/GenerationService/generatePatientsRequest", output = "http://messageReceiver.messaging/GenerationService/generatePatientsResponse")
    public GenerationResponse generatePatients(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Boolean arg1);

}