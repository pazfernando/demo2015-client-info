package ec.com.softwareevolutivo.demos.client.info;

import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://softwareevolutivo.com.ec/client/data")
public interface DataService {
	@WebMethod
	public Map<String, Object> basicInfo(String identification);
}
