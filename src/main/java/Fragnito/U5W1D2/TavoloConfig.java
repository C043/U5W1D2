package Fragnito.U5W1D2;

import Fragnito.U5W1D2.entities.Tavolo;
import Fragnito.U5W1D2.enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TavoloConfig {
    @Bean
    public Tavolo tavolo1(){
        return new Tavolo(1, 4, StatoTavolo.LIBERO);
    }
    @Bean
    public Tavolo tavolo2(){
        return new Tavolo(2, 2, StatoTavolo.LIBERO);
    }
    @Bean
    public Tavolo tavolo3(){
        return new Tavolo(3, 6, StatoTavolo.OCCUPATO);
    }
}
