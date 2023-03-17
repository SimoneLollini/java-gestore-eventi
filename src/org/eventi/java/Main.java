package org.eventi.java;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Evento evento = null;
        String title;
        String date;
        int totalSeats;
        int reservationNum;

        boolean emptyFields = true; // cicli while
        boolean newChoise = false; // richiesta all'utente di fare un operazione (es. aggiungere e rimuovere prenotazioni)

        while (emptyFields) {
            System.out.println("Inserisci titolo evento: ");
            title = scan.nextLine();
            System.out.println("Inserisci data evento: (0000-00-00)");
            date = scan.nextLine();
            System.out.println("Inserisci i posti a sedere massimi dell evento: ");
            totalSeats = Integer.parseInt(scan.nextLine());

            try {
                evento = new Evento(title, LocalDate.parse(date), new BigDecimal(totalSeats));
            } catch (NoSeatsException | IllegalSeatsNumber | DateTimeException e) {
                System.out.println(e.getMessage());
            }

            if (evento != null) {
                System.out.println("Evento inserito correttamente!");
                emptyFields = false;
            }
        } //end while loop

        System.out.println("Vuoi inserire delle prenotazioni? (Y/N)");
        newChoise = scan.nextLine().equalsIgnoreCase("Y");

        if (newChoise) {
            System.out.println("Quante prenotazioni vuoi inserire?");
            reservationNum = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < reservationNum; i++) {
                try {
                    evento.reserve();
                } catch (NoSeatsException e) {
                    System.out.println(e.getMessage());
                    break;
                } catch (DateTimeException e) {
                    System.out.println(e.getMessage()); //valutare di togliere
                }
            } //end for loop
        } //end if


        System.out.println("Numero posti prenotati: " + evento.getBookedSeats() + "\n" +
                "Posti ancora disponibili: " + evento.getTotalSeats().subtract(evento.getBookedSeats())
        );


        System.out.println("Vuoi rimuovere delle prenotazioni? (Y/N)");
        newChoise = scan.nextLine().equalsIgnoreCase("Y");

        if (newChoise) {
            System.out.println("Quante prenotazioni vuoi eliminare?");
            reservationNum = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < reservationNum; i++) {
                try {
                    evento.removeReservation();
                } catch (NoSeatsException e) {
                    System.out.println(e.getMessage());
                    break;
                } catch (DateTimeException e) {
                    System.out.println(e.getMessage()); //valutare di togliere
                }
            } //end for loop
        }   //end if

        System.out.println("Numero posti prenotati: " + evento.getBookedSeats() + "\n" +
                "Posti ancora disponibili: " + evento.getTotalSeats().subtract(evento.getBookedSeats())
        );


        System.out.println("\n \n");

        System.out.println("Creazione concerto...");

        Concerto concert = new Concerto("Concerto bellissimo", LocalDate.parse("2024-12-12"), new BigDecimal(100), LocalTime.parse("19:00"), new BigDecimal("92.50"));

        System.out.println(concert);
    }
}

