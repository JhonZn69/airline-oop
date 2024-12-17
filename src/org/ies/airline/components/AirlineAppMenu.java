package org.ies.airline.components;

import java.util.Scanner;

public class AirlineAppMenu {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineAppMenu(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public int chooseOption() {
        System.out.println("Elige una opcion");
        System.out.println("1. Muestra todos los vuelos");
        System.out.println("2. Mostrar vuelos origen");
        System.out.println("3. Muestra los vuelo del pasajero");
        System.out.println("4. Muestra asientos del pasajero");
        System.out.println("5. Cambiar asiento del pasajero");
        System.out.println("6. Salir");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

}