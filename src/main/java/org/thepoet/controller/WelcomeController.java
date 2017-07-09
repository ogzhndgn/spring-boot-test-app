package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */
@Controller
public class WelcomeController {

    @Value("${project.title}")
    private String projectTitle;

    @RequestMapping(value = {"/", "welcome"}, method = RequestMethod.GET)
    public ModelAndView welcome(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("projectTitle", projectTitle.concat(" Welcome Page"));
        return modelAndView;
    }
}