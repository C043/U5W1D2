package Fragnito.U5W1D2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizza extends Cibo{
    private List<Topping> toppingList;

    public Pizza(String nome, int kcal, double prezzo, List<Topping> toppingList) {
        super(nome, kcal, prezzo);
        this.toppingList = toppingList;
    }
}

