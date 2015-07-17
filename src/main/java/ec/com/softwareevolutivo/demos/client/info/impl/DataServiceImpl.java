package ec.com.softwareevolutivo.demos.client.info.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

import ec.com.softwareevolutivo.demos.client.info.DataService;

@WebService(serviceName = "DataService", portName = "Data", name = "Data", endpointInterface = "ec.com.softwareevolutivo.demos.client.info.DataService", targetNamespace = "http://softwareevolutivo.com.ec/client/data")
public class DataServiceImpl implements DataService {
	public static final Map<String, Map<String, Object>> data = new LinkedHashMap<>();

	static {
		Map<String, Object> info = new LinkedHashMap<>();
		info.put("firstName", "Fernando");
		info.put("lastName", "Ulloa");
		info.put("age", 30);
		data.put("1715303004", info);
	}

	@Override
	public Map<String, Object> basicInfo(String identification) {
		if (data.containsKey(identification)) {
			return data.get(identification);
		}
		return null;
	}

}
