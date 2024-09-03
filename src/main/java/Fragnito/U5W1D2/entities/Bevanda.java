package Fragnito.U5W1D2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Bevanda extends Cibo{
    private double litri;

    public Bevanda(String nome, int kcal, double prezzo, double litri) {
        super(nome, kcal, prezzo);
        this.litri = litri;
    }
    @Override
    public String toString() {
        return "Bevanda: " +
                getNome() + " " +
                getLitri() + "l " +
                "Kcal: " + getKcal() + " " +
                "Prezzo " + getPrezzo();
    }
}
