package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    /**
     * Получение списка всех столиков
     *
     * @return список всех столиков
     */
    public Collection<Table> loadTables() {
        return model.loadTables();
    }

    /**
     * Отобразить список столиков(на представлении)
     */
    public void updateUIShowTables() {
        view.showTables(loadTables());
    }

    public void updateUIShowReservationTableResult(int reservationNumber) {
        view.showReservationTableResult(reservationNumber);
    }

    public void updateUIShowshowСhangeReservationTable(int reservationNumber, int numberTable) {
        view.showСhangeReservationTable(reservationNumber, numberTable);
    }

    @Override
    public void onReservetionTable(Date orderDate, int tableNumber, String nameClients) {
        try {
            int reservationNumber = model.reservationTable(orderDate, tableNumber, nameClients);
            updateUIShowReservationTableResult(reservationNumber);
        } catch (RuntimeException e) {
            updateUIShowReservationTableResult(-1);
        }

    }

    public void onUpdateReservetionTable(int oldReservation, Date reservationDate, int tableNumber,
                                         String nameClients) {
        try {
            int newReservationNumber = model.changeReservationTable(oldReservation, reservationDate, tableNumber,
                    nameClients);
            updateUIShowshowСhangeReservationTable(newReservationNumber, tableNumber);
        } catch (RuntimeException e) {
            updateUIShowshowСhangeReservationTable(-1, -1);
        }
    }
}