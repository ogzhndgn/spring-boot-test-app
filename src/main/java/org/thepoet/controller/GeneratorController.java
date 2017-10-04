package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.controller.base.BaseController;
import org.thepoet.service.IdGeneratorService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 4.10.2017
 */
@Controller
public class GeneratorController extends BaseController {

    @Autowired
    IdGeneratorService idIdGeneratorService;

    @RequestMapping(value = "/getid", method = RequestMethod.GET)
    public ModelAndView generateId(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("generator");
        modelAndView.addObject("firstMessage", super.getPageTitle("#4"));
        String id = idIdGeneratorService.generateUniqueId();
        modelAndView.addObject("id", id);
        return modelAndView;
    }
}