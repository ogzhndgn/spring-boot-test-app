package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.service.RandomService;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */
@Controller
public class RandomController {
    @Value("${project.title}")
    private String projectTitle;

    @Autowired
    RandomService randomService;

    @RequestMapping(value = "random-test", method = RequestMethod.GET)
    public ModelAndView randomGet() {
        ModelAndView modelAndView = new ModelAndView("random");
        modelAndView.addObject("projectTitle", projectTitle.concat(" #2"));
        modelAndView.addObject("randomInt", randomService.getRandomInt());
        return modelAndView;
    }
}