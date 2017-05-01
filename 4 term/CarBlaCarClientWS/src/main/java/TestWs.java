import cxf.Trip;
import cxf.TripsService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

public class TestWs {

    public static void main(String[] args) {
        String soapServiceUrl = "http://localhost:8081/services/tripService";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(TripsService.class);
        factoryBean.setAddress(soapServiceUrl);

        TripsService tripService = (TripsService) factoryBean.create();

        List<Trip> result = tripService.findAll();
        for (Trip trip : result) {
            System.out.println("trip id = " + trip.getId());
        }
    }

}
