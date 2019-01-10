import javax.xml.ws.Endpoint;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new Hello(); 
		Endpoint.publish("http://localhost:8080/hello", hello);
		System.out.print("this is a test.");
	}

}
