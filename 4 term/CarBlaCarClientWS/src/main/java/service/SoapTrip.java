package service;

import cxf.Trip;
import cxf.TripsService;
import model.TripInfo;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoapTrip {

    public List<TripInfo> getAllTrips(){
        String soapServiceUrl = "http://localhost:8081/services/tripService";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(TripsService.class);
        factoryBean.setAddress(soapServiceUrl);

        TripsService tripService = (TripsService) factoryBean.create();

        List<Trip> tripList = tripService.findAll();
        //TODO: map Trip to TripInfo
        return new ArrayList<TripInfo>();
    }

    public void createNewTrip(TripInfo tripInfo){
        Trip trip = new Trip();
        trip.setCount(tripInfo.getPassangersCount());
        trip.setPrice(tripInfo.getPrice().intValue());

        String soapServiceUrl = "http://localhost:8081/services/tripService";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(TripsService.class);
        factoryBean.setAddress(soapServiceUrl);

        TripsService tripService = (TripsService) factoryBean.create();

        tripService.addTrip(trip);
    }
}
