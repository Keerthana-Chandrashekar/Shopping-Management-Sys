package shoppingManagement;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import shoppingManagement.entities.user;
import shoppingManagement.repository.userRepository;

@SpringBootApplication
public class ShoppingManagementSytemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ShoppingManagementSytemApplication.class, args);
		
		System.out.println(" No errors !! ");

		userRepository repository = context.getBean(userRepository.class);
		user user1 = new user();
		user1.setName("keerthana");
		user1.setDesignation("Software Developer");
		user u = repository.save(user1);
		
		
		//get all records
				Iterable<user> itr = repository.findAll();
				Iterator<user> it = itr.iterator();
				
				while(it.hasNext())
				{
					user user = it.next();
					System.out.println(user);
				}
		
	}

}
