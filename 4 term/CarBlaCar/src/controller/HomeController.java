package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class HomeController {

//    @Autowired
//    UsersService usersService;
//
//    @Autowired
//    DriversService driversService;

    @RequestMapping("/")
    String home(ModelMap modelMap) {
        modelMap.put("drivers", new ArrayList<>());
        return "home";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sample() {
        return "home";
    }

//    public static void main(String[] args) throws Exception {
//            SpringApplication.run(SampleController.class, args);
//    }
}