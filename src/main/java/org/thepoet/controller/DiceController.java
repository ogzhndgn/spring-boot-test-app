package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.controller.base.BaseController;
import org.thepoet.service.RandomService;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */
@Controller
public class DiceController extends BaseController {

    private static final int DICE = 6;

    @Autowired
    RandomService randomService;

    @RequestMapping(value = "/dice", method = RequestMethod.GET)
    public ModelAndView randomGet() {
        ModelAndView modelAndView = new ModelAndView("dice");
        modelAndView.addObject("projectTitle", super.getPageTitle("#2"));
        modelAndView.addObject("randomIntOne", randomService.getRandomInt(DICE));
        modelAndView.addObject("randomIntTwo", randomService.getRandomInt(DICE));
        return modelAndView;
    }
}