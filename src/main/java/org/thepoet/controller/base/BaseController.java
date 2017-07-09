package org.thepoet.controller.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */
@Controller
public class BaseController {
    @Value("${project.title}")
    private String projectTitle;

    protected String getPageTitle(String pageSuffix) {
        return projectTitle.concat(pageSuffix);
    }
}
