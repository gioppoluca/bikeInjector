package it.csi.bigiot.bikeinjector.bikeInjector;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

import it.csi.bigiot.bikeinjector.wsdl.IService;
import it.csi.bigiot.bikeinjector.wsdl.InfoRequest;
import it.csi.bigiot.bikeinjector.wsdl.InfoResponse;
import it.csi.bigiot.bikeinjector.wsdl.LoginRequest2;
import it.csi.bigiot.bikeinjector.wsdl.LoginResponse;
import it.csi.bigiot.bikeinjector.wsdl.Municipality;
import it.csi.bigiot.bikeinjector.wsdl.Service;
import it.csi.bigiot.bikeinjector.wsdl.Station;
import it.csi.bigiot.bikeinjector.wsdl.SystemRequest2;
import it.csi.bigiot.bikeinjector.wsdl.SystemResponse;

public class WsTest extends BikeInjectorApplicationTests {
//	@Autowired
//	private WebApplicationContext webApplicationContext;
	private static final Logger log = LoggerFactory.getLogger(BikeInjectorApplicationTests.class);

	@Test
	public void testWs(){
		Service service = new Service();

		IService server = service.getBasicHttpBindingIService();

		
		LoginRequest2 lReq = new LoginRequest2();
		lReq.setCompanyID(960);
		lReq.setPassword("$1tc3i0iBI");
		lReq.setUsername("c3ii0t1$BI");
		LoginResponse resp = server.logon(lReq);
		
		log.info(resp.getToken());
		log.info(resp.getMessage());
		log.info("we have n municipalities: " + resp.getMunicipalities().getMunicipality().size());
		log.info(resp.getResult().value());

		
		InfoRequest iReq = new InfoRequest();
		iReq.setLRes(resp);

		InfoResponse cust = server.getCustomerInfo(iReq);
		log.info("ciustomer:"+cust.getMessage());
		
		int municipalityID = 112;
		iReq = new InfoRequest();
		iReq.setLRes(resp);
//		iReq.setUsername("c3ii0t1$BI");
		InfoResponse custI = server.getCustomerMunicipalityInfo(iReq, municipalityID);
		
		log.info("customer municipality:"+custI.toString());
		log.info(custI.getMessage());
		
//		log.info(custI.getCustomer().getCity());

		Station lStation = new Station();
	//	lStation.
		Station retStation = server.station(lStation);
		log.info(retStation.getLatitude());
		
		SystemRequest2 iReqs = new SystemRequest2();
		iReqs.setLRes(resp);
		iReqs.setMunicipalityID(112);
		SystemResponse sysin = server.getSystemInfo(iReqs);
		log.info("sysInfo:"+sysin.getMessage());
		log.info(sysin.getMunicipality().getName());
		log.info("stations n: "+sysin.getMunicipality().getStations().getStation().size());
		log.info("stations n: "+sysin.getMunicipality().getStations().getStation().get(0).getStationID());
		for (int i = 0; i< sysin.getMunicipality().getStations().getStation().size();i++){
			Station aStat = server.station(sysin.getMunicipality().getStations().getStation().get(i));
			log.info("Column for station x : "+aStat.getColumns().getColumn().size());
			log.info("station id : "+aStat.getStationID());

			log.info(aStat.getColumns().getColumn().get(0).getState().value());
			log.info("column index:"+aStat.getColumns().getColumn().get(0).getIndex());

		}
		
		Municipality lMunicipality = new Municipality();
	//	lMunicipality.setMunicipalityID(112);
		lMunicipality.setPortalID(112);
	//	lMunicipality.
		Municipality retMun = server.municipality(lMunicipality);
		
		log.info(retMun.getName());
		
		System.out.println(resp.toString());
		
	}
}
