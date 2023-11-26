package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showСhangeReservationTable(int reservationNumber, int newNumberTable);


    void registerObserver(ViewObserver observer);

    void reservationTable(Date orderDate, int tableNumber, String nameClients);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String nameClients);
}
