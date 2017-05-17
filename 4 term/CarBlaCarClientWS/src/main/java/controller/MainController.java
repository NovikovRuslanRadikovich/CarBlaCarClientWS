package controller;

import model.TripInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.RestTrip;
import service.SoapTrip;
import service.beans.CbcTripInfo;

@Controller
public class MainController {

    @Autowired
    private RestTrip tripService;

    @RequestMapping(value = "/allTrips")
    public String renderAllTrips(ModelMap modelMap) {
//        modelMap.put("trips", tripService.getAllTrips());
        return "home";
    }

    @RequestMapping(value = "/save")
    public String saveTrip(@ModelAttribute TripInfo tripInfo){
//        tripService.createNewTrip(tripInfo);
        return "home";
    }

    @RequestMapping(value = "trip/{id}")
    public String getTrip(@PathVariable Long id, ModelMap modelMap){
        CbcTripInfo tripInfo = tripService.getTripInfoById(id);
        modelMap.put("trips", tripInfo);
        return "home";
    }

}
