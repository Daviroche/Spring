package Drocha.postconstructpredestroy;

import Drocha.postconstructpredestroy.dao.ClientDAO;
import Drocha.postconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Davirocha
 * @since 15/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class PostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Danielle Kensy"));

		System.out.println("objeto ClientDAO: " + clientDAO);
		System.out.println("objeto cliente: " + clientDAO.getClient());
	}

}
