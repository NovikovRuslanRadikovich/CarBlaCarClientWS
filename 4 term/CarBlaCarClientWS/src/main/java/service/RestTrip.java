package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import service.beans.CbcTripInfo;

@Service
public class RestTrip {

    @Autowired
    RestTemplate restTemplate;

    public static final String API_URL = "http://localhost:8080/api/v1_0/trip/";

    public static final String GET_BY_ID = API_URL + "/{id}";

    public CbcTripInfo getTripInfoById(long goodId) {
        try {
            ResponseEntity<CbcTripInfo> response = restTemplate.getForEntity(
                    GET_BY_ID, CbcTripInfo.class, goodId);
            return response.getBody();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
