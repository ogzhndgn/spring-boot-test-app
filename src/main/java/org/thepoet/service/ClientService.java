package org.thepoet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.thepoet.clientapp.ConfigurationReader;
import org.thepoet.clientapp.exception.ClientException;
import org.thepoet.clientapp.model.BasicUser;
import org.springframework.stereotype.Service;
import org.thepoet.clientapp.service.UserService;

import java.util.List;

/**
 * @author Oguzhan Dogan <oguzhan.dogan@asseco-see.com.tr>
 */
@Service
public class ClientService {
	@Autowired
	RandomService randomService;

	public List<BasicUser> getBasicUserListFromClient() {
		ConfigurationReader configurationReader = new ConfigurationReader("AppName", "databaseConnectionString", 100000);
		return configurationReader.getBasicUserList();
	}

	public String getBasicUserCity() {
		int randomUserId = randomService.getRandomInt(6);
		ConfigurationReader configurationReader = new ConfigurationReader("AppName", "databaseConnectionString", 100000);
		try {
			return configurationReader.getCityOfUser(randomUserId);
		} catch (ClientException e) {
			e.printStackTrace();
			return "N/A";
		}
	}
}
