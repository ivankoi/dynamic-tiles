package com.ivankoi.tiles;

import com.ivankoi.bussines.user.boundry.UserManager;
import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by ivankoi on 8/7/16.
 */
@Component
public class MyAttibutePreparer implements ViewPreparer {

    @Inject
    UserManager userManager;

    public void execute(TilesRequestContext tilesRequestContext, AttributeContext attributeContext) {

        attributeContext.putAttribute("body", new Attribute(userManager.getTileForUser("xxx")));
    }

}
