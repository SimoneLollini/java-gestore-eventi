package org.eventi.java;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean out = false;
        Evento evento = null;
        try {
         evento = new Evento("evento 1", LocalDate.parse("2027-05-10"), new BigDecimal(2));
        }catch (NoSeatsException | IllegalSeatsNumber | DateTimeException e){
            System.out.println(e.getMessage());
        }


    }

}
