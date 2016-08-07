package com.ivankoi.bussines.user.boundry;

import org.apache.tiles.Attribute;
import org.springframework.stereotype.Service;

/**
 * Created by ivankoi on 8/7/16.
 */
@Service
public class UserManager {
    public String greetUser(String name) {
        return "Hello " + name;
    }

    public String getTileForUser(String name) {
        return "/WEB-INF/view/jsp/home1.jsp";
    }
}
