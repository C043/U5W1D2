package Fragnito.U5W1D2;

import Fragnito.U5W1D2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D2Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);

		Menu menu = context.getBean(Menu.class);
		menu.printMenu();

		context.close();
	}

}
