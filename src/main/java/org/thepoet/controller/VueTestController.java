package org.thepoet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 5.02.2018
 */
@Controller
public class VueTestController {
    @GetMapping(value = "/vue-one")
    public ModelAndView vueOne(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/vue/vue-test");
        modelAndView.addObject("testMessaage", "Test Message of Vue #1");
        return modelAndView;
    }
}