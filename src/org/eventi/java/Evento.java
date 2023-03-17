package org.eventi.java;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

//MILESTONE 1
//        Stiamo lavorando a un programma che deve gestire eventi (ad esempio concerti,
//        conferenze, spettacoli,...)

//        Vanno inoltre implementati dei metodi public che svolgono le seguenti funzioni:
//        1. prenota: aggiunge uno ai posti prenotati. Se l’evento è già passato o non ha posti
//        disponibili deve sollevare un’eccezione.
//        2. disdici: riduce di uno i posti prenotati. Se l’evento è già passato o non ci sono
//        prenotazioni deve sollevare un’eccezione.
//        3. l’override del metodo toString() in modo che venga restituita una stringa
//        contenente: data formattata - titolo
//        Aggiungere eventuali metodi (public e private) che vi aiutino a svolgere le funzioni richieste.
public class Evento {

    String title;
    LocalDate date;

    BigDecimal totalSeats;

    BigDecimal bookedSeats = new BigDecimal(0);

    public Evento(String title, LocalDate date, BigDecimal totalSeats) throws DateTimeException, IllegalSeatsNumber {

        if (date.isBefore(LocalDate.now())){
            throw new DateTimeException("Non puoi inserire una data passata!");
        }
        if (totalSeats.compareTo(BigDecimal.ZERO) >= 1){
            throw new IllegalSeatsNumber("I posti totali devono essere superiori o uguali ad 1");
        }

        this.title = title;
        this.date = date;
        this.totalSeats = totalSeats;

    }

    public BigDecimal getTotalSeats() {
        return totalSeats;
    }

    public BigDecimal getBookedSeats() {
        return bookedSeats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



//     1. prenota: aggiunge uno ai posti prenotati. Se l’evento è già passato o non ha posti
//        disponibili deve sollevare un’eccezione.
}



















