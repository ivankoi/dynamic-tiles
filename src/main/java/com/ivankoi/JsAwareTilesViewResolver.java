
package com.ivankoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

public class JsAwareTilesViewResolver extends UrlBasedViewResolver implements ViewResolver {

    @Autowired
    private HttpSession httpSession;

    private boolean jsEnabled() {
        Boolean jsEnabled = (Boolean) httpSession.getAttribute("jsEnabled");
        logger.info("JsEnabled while resolving view [" + jsEnabled  + "]");
        if (jsEnabled == null || !jsEnabled) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected Object getCacheKey(String viewName, Locale locale) {

        if (!jsEnabled()) {
            return viewName;
        } else {
            return "js." + viewName;
        }

    }

    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {
        if (!jsEnabled()) {
            return super.loadView(viewName, locale);
        } else {

            viewName = "js." + viewName;
            View view = super.loadView(viewName, locale);

            if (view == null) {
                viewName = viewName.replaceFirst("js.", "");
                view = super.loadView(viewName, locale);
            }

            return view;
        }

    }
}
