package models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;

    private Table table;

    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public Reservation(Table table, Date date, String name) {
        this.date = date;
        this.name = name;
        this.table = table;
        id = ++counter;
    }
    public void setTable(Table table) {
        this.table = table;
    }

}
