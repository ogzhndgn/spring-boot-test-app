package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.controller.base.BaseController;
import org.thepoet.model.User;
import org.thepoet.service.UserService;

import java.util.List;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 22.08.2017
 */
@Controller
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsers() {
        List<User> userList = userService.getUsers();
        ModelAndView modelAndView = new ModelAndView("user-list");
        modelAndView.addObject("projectTitle", super.getPageTitle("#3"));
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }
}