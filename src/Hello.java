import javax.jws.WebService; 
import javax.jws.WebMethod; 
import javax.xml.ws.Endpoint; 

@WebService(serviceName="Service", portName="Port", name="PortType", targetNamespace="jy")
public class Hello {
	@WebMethod 
	public String hello(String name) { 
	return "Hello, " + name + "\n"; 
	} 
}
