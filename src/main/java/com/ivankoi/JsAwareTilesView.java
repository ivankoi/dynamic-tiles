package com.ivankoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by ivankoi on 9/4/16.
 */
public class JsAwareTilesView extends TilesView {

//    @Override
//    public String getUrl() {
//        Boolean jsEnabled = (Boolean) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession().getAttribute("jsEnabled");
//
//        String viewName = super.getUrl();
//
//        if (jsEnabled == null || !jsEnabled) {
//            logger.info("resolving to: " + viewName);
//            return viewName;
//        } else {
//            logger.info("resolving to: " + "js." + viewName);
//            return "js." + viewName;
//        }
//
//    }

}
