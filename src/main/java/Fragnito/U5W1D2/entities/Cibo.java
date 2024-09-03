package Fragnito.U5W1D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Cibo {
    private String nome;
    private int kcal;
    private double prezzo;

    public Cibo(String nome, int kcal, double prezzo) {
        this.nome = nome;
        this.kcal = kcal;
        this.prezzo = prezzo;
    }
}
