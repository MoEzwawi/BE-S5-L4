package MoEzwawi.BES5L4;

import MoEzwawi.BES5L4.dao.services.MenuItemService;
import MoEzwawi.BES5L4.entities.Topping;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeS5L4Application {


	public static void main(String[] args) {

		SpringApplication.run(BeS5L4Application.class, args);
		Faker faker = new Faker();

	}

}
