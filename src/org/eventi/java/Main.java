package org.eventi.java;

import java.util.Scanner;
//        1. Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento
//        con tutti i parametri.

//        2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni
//        vuole fare e provare ad effettuarle, implementando opportuni controlli e gestendo
//        eventuali eccezioni.
//
//        3. Stampare a video il numero di posti prenotati e quelli disponibili
//        4. Chiedere all’utente se e quanti posti vuole disdire
//        5. Provare ad effettuare le disdette, implementando opportuni controlli e gestendo
//        eventuali eccezioni
//        6. Stampare a video il numero di posti prenotati e quelli disponibili
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Evento evento = null;
        String title;
        String date;
        int totalSeats;


        boolean emptyFields = true; // cicli while
        boolean newReservation = false; // richiesta nuova prenotazione

//        while (emptyFields) {
//            System.out.println("Inserisci titolo evento: ");
//            title = scan.nextLine();
//            System.out.println("Inserisci data evento: (0000-00-00)");
//            date = scan.nextLine();
//            System.out.println("Inserisci i posti a sedere massimi dell evento: ");
//            totalSeats = Integer.parseInt(scan.nextLine());
//
//            try {
//                evento = new Evento(title, LocalDate.parse(date), new BigDecimal(totalSeats));
//            } catch (NoSeatsException | IllegalSeatsNumber | DateTimeException e) {
//                System.out.println(e.getMessage());
//            }
//            if (evento != null) {
//                System.out.println("Evento inserito correttamente!");
//                emptyFields = false;
//            }
//        }

        //        2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni
        //        vuole fare e provare ad effettuarle, implementando opportuni controlli e gestendo
        //        eventuali eccezioni.

        System.out.println("Vuoi inserire delle prenotazioni? (Y/N)");
        newReservation = scan.nextLine().equalsIgnoreCase("Y");

        if (newReservation) {
            //inserire nuove prenotazioni
        }


    }

}
