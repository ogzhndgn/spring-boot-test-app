package org.thepoet.controller;

import org.thepoet.clientapp.model.BasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thepoet.controller.base.BaseController;
import org.thepoet.service.ClientService;

import java.util.List;

/**
 * @author Oguzhan Dogan <oguzhan.dogan@asseco-see.com.tr>
 */
@Controller
public class ClientController extends BaseController {
	@Autowired
	ClientService clientService;

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public ModelAndView get() {
		List<BasicUser> basicUserList = clientService.getBasicUserListFromClient();
		for (BasicUser basicUser : basicUserList) {
			System.out.println(basicUser.getId() + " " + basicUser.getCity() + " " + basicUser.getName());
		}

		String randomUserCity = clientService.getBasicUserCity();
		System.out.println("RANDOM USER CITY: " + randomUserCity);
		clientService.getBasicUserCity();
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("projectTitle", super.getPageTitle("Welcome Page"));
		return modelAndView;
	}
}
