package Fragnito.U5W1D2;

import Fragnito.U5W1D2.entities.Menu;
import Fragnito.U5W1D2.entities.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Menu menu = context.getBean(Menu.class);
        menu.printMenu();

        Ordine ordine =context.getBean(Ordine.class);
        ordine.printOrder();

        context.close();
    }
}
