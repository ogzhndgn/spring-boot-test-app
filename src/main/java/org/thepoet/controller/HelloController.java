package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.controller.base.BaseController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */

@Controller
public class HelloController extends BaseController {

    @Value("${first.message}")
    private String firstMessage;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("firstMessage", firstMessage);
        modelAndView.addObject("projectTitle", super.getPageTitle("#1"));
        return modelAndView;
    }
}