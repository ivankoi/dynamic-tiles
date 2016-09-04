
package com.ivankoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

public class JsAwareTilesViewResolver extends UrlBasedViewResolver implements ViewResolver {

    @Autowired
    private HttpSession httpSession;

    @Override
    protected Object getCacheKey(String viewName, Locale locale) {

        Boolean jsEnabled = (Boolean) httpSession.getAttribute("jsEnabled");

        logger.info("JsEnabled while resolving view [" + jsEnabled  + "]");

        if (jsEnabled == null || !jsEnabled) {
            logger.info("resolving to: " + viewName);
            return viewName;
        } else {
            logger.info("resolving to: " + "js." + viewName);
            return "js." + viewName;
        }

    }

}
