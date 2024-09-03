package Fragnito.U5W1D2.entities;

import Fragnito.U5W1D2.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@ToString
public class Ordine {
    private Tavolo tavolo;
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private List<Cibo> listaCibo;
    private int numeroCoperti;
    private int oraAcquisizione;
    private double totaleOrdine;

    public Ordine(Tavolo tavolo, int numeroOrdine, List<Cibo> listaCibo, int numeroCoperti, double coperto) {
        this.tavolo = tavolo;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.listaCibo = listaCibo;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        this.totaleOrdine = calcoloTotaleOrdine(coperto);
    }

    public double calcoloTotaleOrdine(double coperto){
        return this.listaCibo
                .stream()
                .map(Cibo::getPrezzo)
                .reduce(0.00, Double::sum) + this.numeroCoperti * coperto;
    }
}
