package org.eventi.java;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//        Creare una classe Concerto che estende Evento, che ha anche gli attributi:
//        ● ora: LocalTime
//        ● prezzo: BigDecimal
//        Aggiungere questi attributi nel costruttore e implementarne getter e setter
//        Aggiungere i metodi per restituire data e ora formattata e prezzo formattato (##,##€)
//        Fare l’override del metodo toString() in modo che venga restituita una stringa del tipo:
//        data e ora formattata - titolo - prezzo formattato
public class Concerto extends Evento {
    private LocalTime localTime;
    private BigDecimal price;


    public Concerto(String title, LocalDate date, BigDecimal totalSeats, LocalTime localTime, BigDecimal price) throws DateTimeException, IllegalSeatsNumber {
        super(title, date, totalSeats);

        this.localTime = localTime;
        this.price = price;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public String getFormattedDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    public String getFormattedTime(LocalTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        return time.format(formatter);
    }

    public String getFormattedPrice(BigDecimal n) {
        DecimalFormat decimalFormat = new DecimalFormat("#####.00");
        return decimalFormat.format(n);
    }


    //        Fare l’override del metodo toString() in modo che venga restituita una stringa del tipo:
    //        data e ora formattata - titolo - prezzo formattato


    @Override
    public String toString() {
        return "Data: " + getFormattedDate(getDate()) + "\n" +
                "Ora: " + getFormattedTime(getLocalTime()) + "\n" +
                "Titolo: " + getTitle() + "\n" +
                "Prezzo: " + getFormattedPrice(getPrice()) + "€";
    }
}
