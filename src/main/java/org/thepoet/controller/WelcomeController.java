package org.thepoet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.controller.base.BaseController;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */
@Controller
public class WelcomeController extends BaseController {

    @RequestMapping(value = {"/", "welcome"}, method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("projectTitle", super.getPageTitle("Welcome Page"));
        return modelAndView;
    }
}