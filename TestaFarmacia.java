package poo;

import java.time.LocalDate;

public class TestaFarmacia {
    public static void main(String[] args) {

        Farmacia dipirona = new Farmacia("Dipirona", 5.0f, true, false, LocalDate.of(2024, 5, 15));
        dipirona.visualizar();

        Farmacia fluoxetina = new Farmacia("Fluoxetina", 66.72f, true, true, LocalDate.of(2024, 10, 15));
        fluoxetina.visualizar();
    }
}
