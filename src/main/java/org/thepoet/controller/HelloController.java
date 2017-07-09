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
public class HelloController {

    @Value("${first.message}")
    private String firstMessage;
    @Value("${project.title}")
    private String projectTitle;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("firstMessage", firstMessage);
        modelAndView.addObject("projectTitle", projectTitle.concat(" #1"));
        return modelAndView;
    }
}