package org.eventi.java;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

public class Evento {

    String title;
    LocalDate date;

    BigDecimal totalSeats;

    BigDecimal bookedSeats = new BigDecimal(0);

    public Evento(String title, LocalDate date, BigDecimal totalSeats) throws DateTimeException, IllegalSeatsNumber {

        if (date.isBefore(LocalDate.now())){
            throw new DateTimeException("Non puoi inserire una data passata!");
        }
        if (totalSeats.compareTo(BigDecimal.ZERO) < 0){
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


    public void reserve(){
        if (date.isBefore(LocalDate.now())){
            throw new DateTimeException("Non puoi prenotarti ad un evento già concluso!");
        }
        if (bookedSeats.add(BigDecimal.ONE).compareTo(totalSeats) > 0){
            throw new NoSeatsException("Mi dispiace non ci sono più posti disponibili.");
        }
        bookedSeats = bookedSeats.add(BigDecimal.valueOf(1));
    }



    public void removeReservation(){
        if (date.isBefore(LocalDate.now())){
            throw new DateTimeException("Non puoi rimuovere la prenozione ad un evento già concluso!");
        }
        if (bookedSeats.subtract(BigDecimal.ONE).compareTo(BigDecimal.ZERO)<0){
            throw new NoSeatsException("Mi dispiace non ci sono altre prenotazioni da rimuovere.");
        }
        bookedSeats = bookedSeats.subtract(BigDecimal.ONE);
    }

    @Override
    public String toString() {
        return "data: " + getDate() + " titolo: " + getTitle();
    }
}



















