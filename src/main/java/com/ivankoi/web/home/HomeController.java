package com.ivankoi.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ivankoi on 8/7/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"} , method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}
