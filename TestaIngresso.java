package poo;

import java.time.LocalDate;

public class TestaIngresso {
    public static void main(String[] args) {
        Ingresso showTaylor = new Ingresso("Taylor Swift", 480.0f, LocalDate.of(2023,11,24),"Allianz Parque", "Cadeira Superior Oeste");
        showTaylor.visualizar();

        Ingresso theTown = new Ingresso("The Town", 815.0f, LocalDate.of(2023,9,3), "Autódromo de Interlagos", "Palcos");
        theTown.visualizar();

    }
}
