package org.ies.airline.components;

import org.ies.airline.model.Airline;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public void run() {
        Airline airline = airlineReader.read();
        System.out.println("Introduce datos de la aerolinea");
        System.out.println("Introduce el numero del vuelo");
        int fligNumber = scanner.nextInt();
        scanner.nextLine();
        var flight = airline.findFlightNumber(fligNumber);
        if (flight != null){
            System.out.println("Introduce el NIF del pasajero");
            String nif = scanner.nextLine();
            var passanger = flight.findPassenger(nif);
            if (passanger !=null){
                passanger.showInfoPassenger();
                System.out.println("Introduce el numero de asietno");
                Integer seatNumber = scanner.nextInt();
                scanner.nextLine();
                passanger.setSeatNumber(seatNumber);
            } else {
                System.out.println("Error no existe el pasajero");
            }
        } else {
            System.out.println("Error no existe el vuelo");
        }
    }
}
