package com.ivankoi.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.util.comparator.BooleanComparator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by ivankoi on 8/7/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"} , method = RequestMethod.GET)
    public String home() {
        return "home.definition";
    }

    @RequestMapping(value = {"/", "/home"} , method = RequestMethod.POST)
    public String toggleJs(HttpSession session) {

        Boolean jsEnabled = (Boolean) session.getAttribute("jsEnabled");
        if(jsEnabled != null) {
            session.setAttribute("jsEnabled", !jsEnabled);
        } else {
            session.setAttribute("jsEnabled", true);
        }

        return "home.definition";
    }
}
