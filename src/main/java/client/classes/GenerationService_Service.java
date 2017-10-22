
package client.classes;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "generationService", targetNamespace = "http://messageReceiver.messaging/", wsdlLocation = "http://localhost:8080/patientgenerator-0.1/generationService?wsdl")
public class GenerationService_Service
    extends Service
{

    private final static URL GENERATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException GENERATIONSERVICE_EXCEPTION;
    private final static QName GENERATIONSERVICE_QNAME = new QName("http://messageReceiver.messaging/", "generationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/patientgenerator-0.1/generationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GENERATIONSERVICE_WSDL_LOCATION = url;
        GENERATIONSERVICE_EXCEPTION = e;
    }

    public GenerationService_Service() {
        super(__getWsdlLocation(), GENERATIONSERVICE_QNAME);
    }

    public GenerationService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GENERATIONSERVICE_QNAME, features);
    }

    public GenerationService_Service(URL wsdlLocation) {
        super(wsdlLocation, GENERATIONSERVICE_QNAME);
    }

    public GenerationService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GENERATIONSERVICE_QNAME, features);
    }

    public GenerationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GenerationService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GenerationService
     */
    @WebEndpoint(name = "GenerationServicePort")
    public GenerationService getGenerationServicePort() {
        return super.getPort(new QName("http://messageReceiver.messaging/", "GenerationServicePort"), GenerationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GenerationService
     */
    @WebEndpoint(name = "GenerationServicePort")
    public GenerationService getGenerationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://messageReceiver.messaging/", "GenerationServicePort"), GenerationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GENERATIONSERVICE_EXCEPTION!= null) {
            throw GENERATIONSERVICE_EXCEPTION;
        }
        return GENERATIONSERVICE_WSDL_LOCATION;
    }

}