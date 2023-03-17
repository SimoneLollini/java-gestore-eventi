package bonus;

import org.eventi.java.Evento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProgrammaEventi programList = new ProgrammaEventi("Lista eventi");

        Evento event_1 = new Evento("Evento 1", LocalDate.parse("2024-12-12"), new BigDecimal(100));
        Evento event_2 = new Evento("Evento 2", LocalDate.parse("2024-11-12"), new BigDecimal(100));
        Evento event_3 = new Evento("Evento 3", LocalDate.parse("2024-10-12"), new BigDecimal(100));


        programList.addEvent(event_1);
        programList.addEvent(event_2);
        programList.addEvent(event_3);


        System.out.println("Ci sono " + programList.eventsSize() + " eventi in programma!");

        System.out.println("Lista di eventi con data 2024-12-12");
        System.out.println(programList.eventsInDate(LocalDate.parse("2024-12-12")).toString());
    }
}
