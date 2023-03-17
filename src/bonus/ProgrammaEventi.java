package bonus;

import org.eventi.java.Evento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//● un metodo che restituisce una stringa che mostra il titolo del programma e tutti gli
//eventi ordinati per data nella forma:
//○ data1 - titolo1
//○ data2 - titolo2
//○ data3 - titolo3
//○ ...
public class ProgrammaEventi {

    String title;
    List<Evento> events;


    public ProgrammaEventi(String title) {
        this.title = title;
        events = new ArrayList<>();
    }

    //● un metodo che aggiunge alla lista ProgrammaEventi un Evento, passato come parametro

    public boolean addEvent(Evento event) {
        try {
            events.add(event);
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    //● un metodo che restituisce una lista con tutti gli eventi presenti in una certa data
    public List<Evento> eventsInDate(LocalDate date) {
        List<Evento> newEvents;
        newEvents = events;
        newEvents.removeIf(event -> event.getDate().compareTo(date) == 0);
        return newEvents;
    }

    //● un metodo che restituisce quanti eventi sono presenti nel programma
    public int eventsSize() {
        return events.size();
    }

    //● un metodo che svuota la lista di eventi
    public boolean eventsClear() {
        try {
            events.clear();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
