package Fragnito.U5W1D2;

import Fragnito.U5W1D2.entities.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class OrderConfig {
    @Bean
    public Ordine ordine(@Qualifier("tavolo2")Tavolo tavolo, @Value("${ordine.coperto}") double coperto, @Qualifier("pizza_margherita") Pizza pizzaMargherita, @Qualifier("salami_pizza") Pizza salamiPizza, @Qualifier("birra")Bevanda birra, @Qualifier("vino") Bevanda vino){
        List<Cibo> ciboList = new ArrayList<>();
        ciboList.add(pizzaMargherita);
        ciboList.add(salamiPizza);
        ciboList.add(birra);
        ciboList.add(vino);
        return new Ordine(tavolo, 1, ciboList, 2, coperto);
    }
}
