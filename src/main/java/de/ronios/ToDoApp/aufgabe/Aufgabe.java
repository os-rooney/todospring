package de.ronios.ToDoApp.aufgabe;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Aufgabe {
    @Id
    @GeneratedValue
    private long id;

    private String aufgabe;

    private final Date date = new Date();

    // Standard constructor
    public Aufgabe(){}

    public Aufgabe(String aufgabe){
        this.aufgabe = aufgabe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public Date getDate() {
        return date;
    }

    public String getDatumString(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

}
