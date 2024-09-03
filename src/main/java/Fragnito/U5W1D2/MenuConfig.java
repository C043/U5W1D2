package Fragnito.U5W1D2;

import Fragnito.U5W1D2.entities.Bevanda;
import Fragnito.U5W1D2.entities.Menu;
import Fragnito.U5W1D2.entities.Pizza;
import Fragnito.U5W1D2.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfig {
    @Bean
    public Topping tomato(){
        return new Topping("Tomato", 50, 1);
    }
    @Bean
    public Topping cheese(){
        return new Topping("Cheese", 50, 0.69);
    }
    @Bean
    public Topping ham(){
        return new Topping("Ham", 120, 0.99);
    }
    @Bean
    public Topping pineapple(){
        return new Topping("Pineapple", 24, 0.79);
    }
    @Bean
    public Topping salami(){
        return new Topping("Salami", 86, 0.99);
    }
    @Bean
    public Pizza pizzaMargherita(){
        List<Topping> margheritaToppings = new ArrayList<>();
        margheritaToppings.add(tomato());
        margheritaToppings.add(cheese());
        return new Pizza("Pizza Margherita (tomato, cheese)", 1104, 4.99, margheritaToppings);
    }
    @Bean
    public Pizza hawaiianPizza(){
        List<Topping> hawaiianPizzaToppings = new ArrayList<>();
        hawaiianPizzaToppings.add(tomato());
        hawaiianPizzaToppings.add(cheese());
        hawaiianPizzaToppings.add(ham());
        hawaiianPizzaToppings.add(pineapple());
        return new Pizza("Hawaiian Pizza (tomato, cheese, ham, pineapple)", 1024, 6.49, hawaiianPizzaToppings);
    }
    @Bean
    public Pizza salamiPizza(){
        List<Topping> salamiPizzaToppings = new ArrayList<>();
        salamiPizzaToppings.add(tomato());
        salamiPizzaToppings.add(cheese());
        salamiPizzaToppings.add(salami());
        return new Pizza("Salami Pizza (tomato, cheese, salami)", 1160, 5.99, salamiPizzaToppings);
    }
    @Bean
    public Bevanda acqua(){
        return new Bevanda("Water", 0, 1.29, 0.5);
    }
    @Bean
    public Bevanda birra(){
        return new Bevanda("Beer", 355, 5, 0.55);
    }
    @Bean
    public Bevanda vino(){
        return new Bevanda("Wine", 607, 7.49, 0.75);
    }
    @Bean
    public Menu menu(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();
        List<Bevanda> bevandaList = new ArrayList<>();

        pizzaList.add(pizzaMargherita());
        pizzaList.add(hawaiianPizza());
        pizzaList.add(salamiPizza());

        toppingList.add(tomato());
        toppingList.add(cheese());
        toppingList.add(ham());
        toppingList.add(pineapple());
        toppingList.add(salami());

        bevandaList.add(acqua());
        bevandaList.add(birra());
        bevandaList.add(vino());

        return new Menu(pizzaList, toppingList, bevandaList);
    }
}
